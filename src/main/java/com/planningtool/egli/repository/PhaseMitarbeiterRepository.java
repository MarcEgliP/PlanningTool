package com.planningtool.egli.repository;

import com.planningtool.egli.models.database.PhaseMitarbeiter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhaseMitarbeiterRepository extends JpaRepository<PhaseMitarbeiter, Integer> {
}
