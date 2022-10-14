package com.planningtool.egli.repository;

import com.planningtool.egli.models.database.PhaseProjekt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhaseProjektRepository extends JpaRepository<PhaseProjekt, Integer> {
}
