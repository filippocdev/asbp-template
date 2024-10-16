package com.example.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;


@Entity
@Table(name = "cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @Column(name = "codicefiscale")
    private String codiceFiscale;

    @Column( name = "nome")
    private String nome;

    @Column( name = "cognome")
    private String cognome;

    @Column( name = "email")
    private String email;

    @Column( name = "telefono")
    private String telefono;

    @Column( name = "datanascita")
    private LocalDate dataNascita;

    @Column( name = "dataiscrizione")
    private LocalDate dataIscrizione;

    @Column( name = "indirizzo")
    private String indirizzo;

    @Column( name = "città")
    private String citta;

    @Column( name = "età")
    private int age;

    @ManyToOne
    @JoinColumn(name = "ruolo_id", referencedColumnName = "id")
    private Ruolo ruolo;

}
