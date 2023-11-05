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
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numMoniteur;

    private String nomMoniteur;

    private String prenomPiste;

    private LocalDate dateRecru;

    @JsonIgnore
    @OneToMany
    private Set<Cours> courses;

}
