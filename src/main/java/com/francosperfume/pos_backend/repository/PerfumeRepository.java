package com.francosperfume.pos_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.francosperfume.pos_backend.model.Perfume;

@Repository
public interface PerfumeRepository extends JpaRepository<Perfume, Long> {
}