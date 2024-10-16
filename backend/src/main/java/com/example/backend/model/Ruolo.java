package com.example.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ruoli")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ruolo {

    @Id
    @GeneratedValue(generator = "ruoli_id_seq")
    @SequenceGenerator( name="ruoli_id_seq", allocationSize=1 )
    @Column( name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "grado")
    private String grado;
}
