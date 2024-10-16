package com.example.backend.service;

import com.example.backend.model.Bike;
import com.example.backend.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BikeService {

    @Autowired
    private BikeRepository bikeRepository;

    public List<Bike> findAll() {
        return bikeRepository.findAll();
    }

    public Optional<Bike> findById(Integer id) {
        return bikeRepository.findById(id);
    }

    public Bike save(Bike bike) {
        return bikeRepository.save(bike);
    }

    public void deleteById(Integer id) {
        bikeRepository.deleteById(id);
    }

    public Object getAll() {
        return bikeRepository.findAll();
    }
}
