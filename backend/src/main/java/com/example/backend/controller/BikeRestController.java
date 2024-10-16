package com.example.backend.controller;

import com.example.backend.service.BikeService;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/bike")
public class BikeRestController {

    private BikeService bikeService;

    @GetMapping("/get/all")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(bikeService.getAll());
    }

    @Data
    public static class CreateAcquistoNoleggioDTO{

        @NotBlank
        private Integer bike_codmezzo;

        private String bike_tipologia;

        private Float bike_diametroruota;

        private Boolean bike_pieghevole;

        public CreateAcquistoNoleggioDTO(@JsonProperty("bike_codmezzo") Integer bike_codmezzo,
                                         @JsonProperty("bike_tipologia") String bike_tipologia,
                                         @JsonProperty("bike_diametroruota") float bike_diametroruota,
                                         @JsonProperty("bike_pieghevole") boolean bike_pieghevole) {
            this.bike_codmezzo = bike_codmezzo;
            this.bike_tipologia = bike_tipologia;
            this.bike_diametroruota =  bike_diametroruota;
            this.bike_pieghevole = bike_pieghevole;
        }
    }
}

