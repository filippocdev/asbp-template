package com.example.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ebike")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EBike extends Mezzo {

    @Column(name = "autonomia")
    private Double autonomia;

    @Column(name = "potenza")
    private Integer potenza;

    @Column(name = "temporicarica")
    private String tempoRicarica;

    @Column(name = "tipologia")
    private String tipologia;

    @Column(name = "diametroruota")
    private Double diametroRuota;

    @Column(name = "pieghevole")
    private Boolean pieghevole;
}
