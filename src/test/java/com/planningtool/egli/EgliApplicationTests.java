package com.planningtool.egli;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

public class EgliApplicationTests {

	@Test
	public void testSerialVersionUID() {

		Set<Class> allEntitys = findAllClassesUsingReflectionsLibrary("com.planningtool.egli.models.database");
		
		List<String> entityWithoutUIDS = new ArrayList<>();
		Map<Long, String> allUIDS = new HashMap<>();
		Map<Long, List<String>> doppelteUIDS = new HashMap<>();

		Iterator<Class> itr = allEntitys.iterator();
		while(itr.hasNext()){
			
			Class<? extends Object> next = itr.next();
			System.out.println(next.getName());
            try {
				Field privateField = next.getDeclaredField("serialVersionUID");
				privateField.setAccessible(true);
				Constructor<?> cons = next.getConstructor();
				Object object = cons.newInstance();
				Long uid = (Long) privateField.get(object);
				
				if(allUIDS.get(uid) != null){
					if(doppelteUIDS.get(uid) != null){
						doppelteUIDS.get(uid).add(next.getCanonicalName());
					}else{
						doppelteUIDS.put(uid, new ArrayList<String>() {
							{
								add(next.getCanonicalName());
							}
						});
					}

					if(!doppelteUIDS.get(uid).contains(allUIDS.get(uid))){
						doppelteUIDS.get(uid).add(allUIDS.get(uid));
					}
					
				}else{
					allUIDS.put(uid, next.getCanonicalName());
				}
				

			} catch (NoSuchFieldException e) {
				entityWithoutUIDS.add(next.getCanonicalName());
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | SecurityException | NoSuchMethodException e) {
				e.printStackTrace();
				assertTrue(false);
			}
		}		assertTrue(doppelteUIDS.isEmpty(), doppelteUIDS.toString());


		assertTrue(entityWithoutUIDS.isEmpty(),entityWithoutUIDS.toString());
	}


	public Set<Class> findAllClassesUsingReflectionsLibrary(String packageName) {
		Reflections reflections = new Reflections(packageName, new  SubTypesScanner(false));
		return reflections.getSubTypesOf(Object.class)
		  .stream()
		  .collect(Collectors.toSet());
	}

}
