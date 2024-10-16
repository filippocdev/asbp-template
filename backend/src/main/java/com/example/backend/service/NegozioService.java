package com.example.backend.service;

import com.example.backend.model.Negozio;
import com.example.backend.repository.NegozioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NegozioService {

    @Autowired
    private NegozioRepository negozioRepository;

    public List<Negozio> findAll() {
        return negozioRepository.findAll();
    }

    public Optional<Negozio> findById(String piva) {
        return negozioRepository.findById(piva);
    }

    public Negozio save(Negozio negozio) {
        return negozioRepository.save(negozio);
    }

    public void deleteById(String piva) {
        negozioRepository.deleteById(piva);
    }
}
