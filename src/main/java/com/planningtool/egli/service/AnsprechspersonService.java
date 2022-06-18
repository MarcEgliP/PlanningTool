package com.planningtool.egli.service;

import com.planningtool.egli.exceptions.NotFoundException;
import com.planningtool.egli.models.database.Ansprechsperson;
import com.planningtool.egli.repository.AnsprechspersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnsprechspersonService {
    private final AnsprechspersonRepository ansprechspersonRepository;

    @Autowired
    public AnsprechspersonService(AnsprechspersonRepository ansprechspersonRepository) {
        this.ansprechspersonRepository = ansprechspersonRepository;
    }

    public List<Ansprechsperson> getAll() {
        return this.ansprechspersonRepository.findAll();
    }

    public Ansprechsperson getSingle(Integer id) {
        return this.ansprechspersonRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    public void delete(Integer id) {
        this.ansprechspersonRepository.deleteById(id);
    }

    public Ansprechsperson save(Ansprechsperson ansprechsperson) {
        return this.ansprechspersonRepository.save(ansprechsperson);
    }
}
