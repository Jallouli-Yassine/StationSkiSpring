package tn.esprit.tp2stationskiyassinejallouli4twin7.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Setter
@Getter
@Entity
public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numAbon;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    private Float prixAbon;

    private TypeAbonnement typeAbon;

}
