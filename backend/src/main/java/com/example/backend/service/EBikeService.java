package com.example.backend.service;

import com.example.backend.model.EBike;
import com.example.backend.repository.EBikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EBikeService {

    @Autowired
    private EBikeRepository eBikeRepository;

    public List<EBike> findAll() {
        return eBikeRepository.findAll();
    }

    public Optional<EBike> findById(Integer id) {
        return eBikeRepository.findById(id);
    }

    public EBike save(EBike eBike) {
        return eBikeRepository.save(eBike);
    }

    public void deleteById(Integer id) {
        eBikeRepository.deleteById(id);
    }
}
