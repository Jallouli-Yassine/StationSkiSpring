package tn.esprit.tp2stationskiyassinejallouli4twin7.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Setter
@Getter
@Entity
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numCours;

    private int niveau;

    private TypeCours typeCours;

    private Support support;

    private Float prix;

    private int creneau;

    @JsonIgnore
    @OneToMany(mappedBy = "cours")
    private Set<Inscription> inscriptions;


}
