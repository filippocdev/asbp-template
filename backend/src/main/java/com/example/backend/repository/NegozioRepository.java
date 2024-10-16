package com.example.backend.repository;

import com.example.backend.model.Negozio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NegozioRepository extends JpaRepository<Negozio, String> {
}
