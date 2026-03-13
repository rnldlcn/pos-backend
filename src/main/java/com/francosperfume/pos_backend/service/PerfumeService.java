package com.francosperfume.pos_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.francosperfume.pos_backend.dto.PerfumeRequest;
import com.francosperfume.pos_backend.model.Perfume;
import com.francosperfume.pos_backend.repository.PerfumeRepository; 

@Service
public class PerfumeService {
    
    @Autowired
    private PerfumeRepository perfumeRepository;

    // Add a new perfume using the DTO
    public Perfume addPerfume(PerfumeRequest request) {
        
        // 1. Create a blank database Entity
        Perfume newPerfume = new Perfume();
        
        // 2. Transfer the secure data from the DTO into the database Entity
        newPerfume.setName(request.getName());
        newPerfume.setBrand(request.getBrand());
        newPerfume.setPrice(request.getPrice());
        newPerfume.setStockQuantity(request.getStockQuantity());
        
        // 3. Save the actual Entity to PostgreSQL
        return perfumeRepository.save(newPerfume);
    }

    // Fetch all perfumes from the vault
    public List<Perfume> getAllPerfumes() {
        return perfumeRepository.findAll();
    }
}