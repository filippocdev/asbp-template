package com.example.backend.service;

import com.example.backend.model.MonopattinoElettrico;
import com.example.backend.repository.MonopattinoElettricoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonopattinoElettricoService {

    @Autowired
    private MonopattinoElettricoRepository monopattinoElettricoRepository;

    public List<MonopattinoElettrico> findAll() {
        return monopattinoElettricoRepository.findAll();
    }

    public Optional<MonopattinoElettrico> findById(Integer id) {
        return monopattinoElettricoRepository.findById(id);
    }

    public MonopattinoElettrico save(MonopattinoElettrico monopattinoElettrico) {
        return monopattinoElettricoRepository.save(monopattinoElettrico);
    }

    public void deleteById(Integer id) {
        monopattinoElettricoRepository.deleteById(id);
    }
}
