package com.example.backend.repository;

import com.example.backend.model.Mezzo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MezzoRepository extends JpaRepository<Mezzo, Integer> {
}
