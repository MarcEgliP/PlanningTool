package com.planningtool.egli.service;

import com.planningtool.egli.exceptions.NotFoundException;
import com.planningtool.egli.models.database.StatusMitarbeiter;
import com.planningtool.egli.repository.StatusMitarbeiterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusMitarbeiterService {
    private final StatusMitarbeiterRepository statusMitarbeiterRepository;

    @Autowired
    public StatusMitarbeiterService(StatusMitarbeiterRepository statusMitarbeiterRepository) {
        this.statusMitarbeiterRepository = statusMitarbeiterRepository;
    }

    public List<StatusMitarbeiter> getAll() {
        return this.statusMitarbeiterRepository.findAll();
    }

    public StatusMitarbeiter getSingle(Integer id) {
        return this.statusMitarbeiterRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    public void delete(Integer id) {
        this.statusMitarbeiterRepository.deleteById(id);
    }

    public StatusMitarbeiter save(StatusMitarbeiter statusMitarbeiter) {
        return this.statusMitarbeiterRepository.save(statusMitarbeiter);
    }
}
