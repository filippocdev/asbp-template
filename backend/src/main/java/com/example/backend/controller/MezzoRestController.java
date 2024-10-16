package com.example.backend.controller;

import com.example.backend.service.EBikeService;
import com.example.backend.service.MezzoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/mezzo")
public class MezzoRestController {

    private MezzoService mezzoService;

    @GetMapping("/get/all")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(mezzoService.findAll());
    }
}
