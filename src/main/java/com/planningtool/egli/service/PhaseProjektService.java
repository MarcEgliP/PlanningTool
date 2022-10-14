package com.planningtool.egli.service;

import com.planningtool.egli.exceptions.NotFoundException;
import com.planningtool.egli.models.database.PhaseProjekt;
import com.planningtool.egli.repository.PhaseProjektRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhaseProjektService {
    private final PhaseProjektRepository phaseProjektRepository;

    @Autowired
    public PhaseProjektService(PhaseProjektRepository phaseProjektRepository) {
        this.phaseProjektRepository = phaseProjektRepository;
    }

    public List<PhaseProjekt> getAll() {
        return this.phaseProjektRepository.findAll();
    }

    public PhaseProjekt getSingle(Integer id) {
        return this.phaseProjektRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    public void delete(Integer id) {
        this.phaseProjektRepository.deleteById(id);
    }

    public PhaseProjekt save(PhaseProjekt phaseProjekt) {
        return this.phaseProjektRepository.save(phaseProjekt);
    }
}
