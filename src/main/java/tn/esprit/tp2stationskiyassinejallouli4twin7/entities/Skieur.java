package tn.esprit.tp2stationskiyassinejallouli4twin7.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Setter
@Getter
@Entity
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSkieur;

    private String nomS;

    private String prenomS;

    private LocalDate dateNaissance;

    private String ville;

    @JsonIgnore
    @ManyToMany(mappedBy = "skieurs")
    private Set<Piste> pistes;

    @JsonIgnore
    @OneToMany(mappedBy = "skieur")
    private Set<Inscription> inscriptions;

    @JsonIgnore
    @OneToOne
    private Abonnement abonnement;
}
