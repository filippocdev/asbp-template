package com.example.backend.repository;

import com.example.backend.model.MonopattinoElettrico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonopattinoElettricoRepository extends JpaRepository<MonopattinoElettrico, Integer> {
}
