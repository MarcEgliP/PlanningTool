package com.planningtool.egli.service;

import com.planningtool.egli.exceptions.NotFoundException;
import com.planningtool.egli.models.database.ProjektMitarbeiter;
import com.planningtool.egli.repository.ProjektMitarbeiterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjektMitarbeiterService {
    private final ProjektMitarbeiterRepository projektMitarbeiterRepository;

    @Autowired
    public ProjektMitarbeiterService(ProjektMitarbeiterRepository projektMitarbeiterRepository) {
        this.projektMitarbeiterRepository = projektMitarbeiterRepository;
    }

    public List<ProjektMitarbeiter> getAll() {
        return this.projektMitarbeiterRepository.findAll();
    }

    public ProjektMitarbeiter getSingle(Integer id) {
        return this.projektMitarbeiterRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    public void delete(Integer id) {
        this.projektMitarbeiterRepository.deleteById(id);
    }

    public ProjektMitarbeiter save(ProjektMitarbeiter projektMitarbeiter) {
        return this.projektMitarbeiterRepository.save(projektMitarbeiter);
    }
}
