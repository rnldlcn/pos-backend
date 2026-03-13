package com.francosperfume.pos_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.francosperfume.pos_backend.dto.PerfumeRequest;
import com.francosperfume.pos_backend.model.Perfume;
import com.francosperfume.pos_backend.service.PerfumeService;

@RestController
@RequestMapping("/api/perfumes")
@CrossOrigin
public class PerfumeController {

    @Autowired
    private PerfumeService perfumeService;

    // POST: Add a new perfume using the DTO
    @PostMapping
    public Perfume addPerfume(@RequestBody PerfumeRequest request) {
        return perfumeService.addPerfume(request);
    }

    // GET: Fetch all perfumes from the vault
    @GetMapping
    public List<Perfume> getAllPerfumes() {
        return perfumeService.getAllPerfumes();
    }
}