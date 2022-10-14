package com.planningtool.egli.service;

import com.planningtool.egli.exceptions.NotFoundException;
import com.planningtool.egli.models.database.Projekt;
import com.planningtool.egli.repository.ProjektRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjektService {
    private final ProjektRepository projektRepository;

    @Autowired
    public ProjektService(ProjektRepository projektRepository) {
        this.projektRepository = projektRepository;
    }

    public List<Projekt> getAll() {
        return this.projektRepository.findAll();
    }

    public Projekt getSingle(Integer id) {
        return this.projektRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    public void delete(Integer id) {
        this.projektRepository.deleteById(id);
    }

    public Projekt save(Projekt projekt) {
        return this.projektRepository.save(projekt);
    }
}
