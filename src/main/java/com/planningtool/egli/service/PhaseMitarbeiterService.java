package com.planningtool.egli.service;

import com.planningtool.egli.exceptions.NotFoundException;
import com.planningtool.egli.models.database.PhaseMitarbeiter;
import com.planningtool.egli.repository.PhaseMitarbeiterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhaseMitarbeiterService {
    private final PhaseMitarbeiterRepository phaseMitarbeiterRepository;

    @Autowired
    public PhaseMitarbeiterService(PhaseMitarbeiterRepository phaseMitarbeiterRepository) {
        this.phaseMitarbeiterRepository = phaseMitarbeiterRepository;
    }

    public List<PhaseMitarbeiter> getAll() {
        return this.phaseMitarbeiterRepository.findAll();
    }

    public PhaseMitarbeiter getSingle(Integer id) {
        return this.phaseMitarbeiterRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    public void delete(Integer id) {
        this.phaseMitarbeiterRepository.deleteById(id);
    }

    public PhaseMitarbeiter save(PhaseMitarbeiter phaseMitarbeiter) {
        return this.phaseMitarbeiterRepository.save(phaseMitarbeiter);
    }
}
