package com.example.backend.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "negozio")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Negozio {

    @Id
    @Column( name = "piva")
    private String piva;

    @Column( name = "ragionesociale" )
    private String ragionesociale;

    @Column( name = "città" )
    private String città;

    @Column( name = "indirizzo" )
    private String indirizzo;

    @Column( name = "cap" )
    private String cap;

    @Column( name = "email" )
    private String email;

    @Column( name = "telefono" )
    private String telefono;

}
