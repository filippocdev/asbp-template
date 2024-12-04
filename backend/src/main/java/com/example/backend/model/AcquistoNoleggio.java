package com.example.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// import org.springframework.stereotype.Component;

import java.util.Date;

@Entity
@Table(name = "acquistonoleggio")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AcquistoNoleggio {

    @Id
    @GeneratedValue(generator = "aqnl_id_seq")
    @SequenceGenerator( name = "aqnl_id_seq",allocationSize = 1)
    @Column(name = "id")
    private Integer id;

    @Column(name = "descrizione")
    private String descrizione;

    @Column(name = "importo")
    private Double importo;

    @Column(name = "datainizio")
    private Date dataInizio;

    @Column(name = "datafine")
    private Date dataFine;

    @Column(name = "tipologia")
    private String tipologia; // Acquisto o Noleggio

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codicefiscale", referencedColumnName = "codicefiscale")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "piva", referencedColumnName = "piva")
    private Negozio negozio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idmezzo", referencedColumnName = "id")
    private Mezzo mezzo;
}
