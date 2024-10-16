package com.example.backend.controller;

import com.example.backend.service.EBikeService;
import com.example.backend.service.MonopattinoElettricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/monopattinoelettrico")
public class MonopattinoElettricoRestController {

    private MonopattinoElettricoService monopattinoElettricoService;

    @GetMapping("/get/all")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(monopattinoElettricoService.findAll());
    }
}