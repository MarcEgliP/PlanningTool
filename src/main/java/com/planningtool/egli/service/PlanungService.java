package com.planningtool.egli.service;

import com.planningtool.egli.exceptions.NotFoundException;
import com.planningtool.egli.models.database.Planung;
import com.planningtool.egli.repository.PlanungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanungService {
    private final PlanungRepository planungRepository;

    @Autowired
    public PlanungService(PlanungRepository planungRepository) {
        this.planungRepository = planungRepository;
    }

    public List<Planung> getAll() {
        return this.planungRepository.findAll();
    }

    public Planung getSingle(Integer id) {
        return this.planungRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    public void delete(Integer id) {
        this.planungRepository.deleteById(id);
    }

    public Planung save(Planung planung) {
        return this.planungRepository.save(planung);
    }
}
