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
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numInscription;

    private int numSemaine;

    @JsonIgnore
    @ManyToOne
    private Skieur skieur;

    @JsonIgnore
    @ManyToOne
    private Cours cours;

}
