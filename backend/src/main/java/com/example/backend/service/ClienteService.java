package com.example.backend.service;

import com.example.backend.model.Cliente;
import com.example.backend.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> findById(String codiceFiscale) {
        return clienteRepository.findById(codiceFiscale);
    }

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deleteById(String codiceFiscale) {
        clienteRepository.deleteById(codiceFiscale);
    }
}
