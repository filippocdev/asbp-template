package com.example.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bike")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bike extends Mezzo {

    @Column(name = "tipologia")
    private String tipologia;

    @Column(name = "diametroruota")
    private Double diametroRuota;

    @Column(name = "pieghevole")
    private Boolean pieghevole;
}
