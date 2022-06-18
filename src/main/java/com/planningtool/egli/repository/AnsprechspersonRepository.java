package com.planningtool.egli.repository;

import com.planningtool.egli.models.database.Ansprechsperson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AnsprechspersonRepository extends JpaRepository<Ansprechsperson, Integer> {

}
