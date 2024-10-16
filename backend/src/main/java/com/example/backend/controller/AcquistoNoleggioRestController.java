package com.example.backend.controller;

import com.example.backend.service.AcquistoNoleggioService;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/acquisto")
public class AcquistoNoleggioRestController {

    private AcquistoNoleggioService acquistoNoleggioService;

    @GetMapping("/get/{acquistonoleggioID}")
    public ResponseEntity<?> getById(@PathVariable Integer acquistonoleggioID) {
        return ResponseEntity.ok(acquistoNoleggioService.findById(acquistonoleggioID));
    }

    @GetMapping("/get/All")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(acquistoNoleggioService.findAll());
    }

    @Data
    public static class CreateAcquistoNoleggioDTO{

        @NotBlank
        private Integer acquistonoleggioID;

        @NotBlank
        private String acquistonoleggio_codicefiscale;

        @NotBlank
        private String acquistonoleggio_idmezzo;

        @NotBlank
        private String acquistonoleggio_piva;

        @JsonCreator
        public CreateAcquistoNoleggioDTO(@JsonProperty("acquistonoleggioID") Integer acquistonoleggioID,
                                         @JsonProperty("acquistonoleggio_codicefiscale") String acquistonoleggio_codicefiscale,
                                         @JsonProperty("acquistonoleggio_idmezzo") String acquistonoleggio_idmezzo,
                                         @JsonProperty("acquistonoleggio_piva") String acquistonoleggio_piva){
            this.acquistonoleggioID = acquistonoleggioID;
            this.acquistonoleggio_codicefiscale = acquistonoleggio_codicefiscale;
            this.acquistonoleggio_idmezzo = acquistonoleggio_idmezzo;
            this.acquistonoleggio_piva = acquistonoleggio_piva;
        }


    }

}
