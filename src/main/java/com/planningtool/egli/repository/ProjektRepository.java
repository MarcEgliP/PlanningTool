package com.planningtool.egli.repository;

import com.planningtool.egli.models.database.Ansprechsperson;
import com.planningtool.egli.models.database.Projekt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjektRepository extends JpaRepository<Projekt, Integer> {
}
