package com.planningtool.egli.repository;

import com.planningtool.egli.models.database.StatusMitarbeiter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusMitarbeiterRepository extends JpaRepository<StatusMitarbeiter, Integer> {
}
