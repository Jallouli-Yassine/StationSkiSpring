package tn.esprit.tp2stationskiyassinejallouli4twin7.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.io.Serializable;
import java.util.Set;

@Setter
@Getter
@Entity
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numPiste;

    private String nomPiste;

    private Couleur couleur;

    private int longeur;

    private int pente;

    @ManyToMany
    private Set<Skieur> skieurs;



}
