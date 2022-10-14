package com.planningtool.egli.repository;

import com.planningtool.egli.models.database.Planung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanungRepository extends JpaRepository<Planung, Integer> {
}
