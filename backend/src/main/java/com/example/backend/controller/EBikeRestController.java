package com.example.backend.controller;

import com.example.backend.service.BikeService;
import com.example.backend.service.EBikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/ebike")
public class EBikeRestController {

    private EBikeService ebikeService;

    @GetMapping("/get/all")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(ebikeService.findAll());
    }
}

