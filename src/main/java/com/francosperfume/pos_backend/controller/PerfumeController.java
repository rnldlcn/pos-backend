package com.francosperfume.pos_backend.controller;

import com.francosperfume.pos_backend.model.Perfume;
import com.francosperfume.pos_backend.repository.PerfumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/perfumes")
@CrossOrigin 
public class PerfumeController {

    @Autowired
    private PerfumeRepository perfumeRepository;

    // POST: Add a new perfume to the vault
    @PostMapping
    public Perfume addPerfume(@RequestBody Perfume perfume) {
        return perfumeRepository.save(perfume);
    }

    // GET: Fetch all perfumes from the vault
    @GetMapping
    public List<Perfume> getAllPerfumes() {
        return perfumeRepository.findAll();
    }
}