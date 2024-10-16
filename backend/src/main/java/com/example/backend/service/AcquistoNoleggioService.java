package com.example.backend.service;

import com.example.backend.model.AcquistoNoleggio;
import com.example.backend.repository.AcquistoNoleggioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AcquistoNoleggioService {

    @Autowired
    private AcquistoNoleggioRepository acquistoNoleggioRepository;

    public List<AcquistoNoleggio> findAll() {
        return acquistoNoleggioRepository.findAll();
    }

    public Optional<AcquistoNoleggio> findById(Integer id) {
        return acquistoNoleggioRepository.findById(id);
    }

    public AcquistoNoleggio save(AcquistoNoleggio acquistoNoleggio) {
        return acquistoNoleggioRepository.save(acquistoNoleggio);
    }

    public void deleteById(Integer id) {
        acquistoNoleggioRepository.deleteById(id);
    }
}
