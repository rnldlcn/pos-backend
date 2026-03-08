package com.francosperfume.pos_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.francosperfume.pos_backend.model.Perfume;
import com.francosperfume.pos_backend.repository.PerfumeRepository;

@Service
public class PerfumeService {
    @Autowired
    private PerfumeRepository perfumeRepository;

    // Add a new perfume to the vault
    public Perfume addPerfume(Perfume perfume) {
        return perfumeRepository.save(perfume);
    }

    // Fetch all perfumes from the vault
    public List<Perfume> getAllPerfumes() {
        return perfumeRepository.findAll();
    }
}
