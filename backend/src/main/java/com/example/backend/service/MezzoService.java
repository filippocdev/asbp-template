package com.example.backend.service;

import com.example.backend.model.Mezzo;
import com.example.backend.repository.MezzoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MezzoService {

    @Autowired
    private MezzoRepository mezzoRepository;

    public List<Mezzo> findAll() {
        return mezzoRepository.findAll();
    }

    public Optional<Mezzo> findById(Integer id) {
        return mezzoRepository.findById(id);
    }

    public Mezzo save(Mezzo mezzo) {
        return mezzoRepository.save(mezzo);
    }

    public void deleteById(Integer id) {
        mezzoRepository.deleteById(id);
    }
}
