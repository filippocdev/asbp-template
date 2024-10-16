package com.example.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "mezzo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED) // O TABLE_PER_CLASS o SINGLE_TABLE a seconda delle esigenze
public class Mezzo {

    @Id
    @GeneratedValue(generator = "mezzo_id_seq")
    @SequenceGenerator( name = "mezzo_id_seq",allocationSize = 1)
    @Column(name = "id")
    private Integer id;

    @Column(name = "numeromodello")
    private String numeroModello;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descrizione")
    private String descrizione;

    @Column(name = "colore")
    private String colore;

    @Column(name = "materiale")
    private String materiale;

    @Column(name = "marca")
    private String marca;

    @Column(name = "peso")
    private Double peso;

    @Column(name = "dimensioni")
    private String dimensioni;

    @ManyToOne
    @JoinColumn(name = "piva", referencedColumnName = "piva")
    private Negozio negozio;
}
