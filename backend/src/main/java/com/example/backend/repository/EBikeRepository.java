package com.example.backend.repository;

import com.example.backend.model.EBike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EBikeRepository extends JpaRepository<EBike, Integer> {
}
