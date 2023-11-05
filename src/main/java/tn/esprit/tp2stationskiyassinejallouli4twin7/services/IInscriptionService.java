package tn.esprit.tp2stationskiyassinejallouli4twin7.services;

import tn.esprit.tp2stationskiyassinejallouli4twin7.entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    List<Inscription> retrieveAllINSCs();

    Inscription addInscription(Inscription insc);
    Inscription updateInscription (Inscription insc);
    Inscription retrieveInscription (Long numInscription);

    Inscription addRegistrationAndAssignToSkier(Inscription inscription, Long numSkieur);
    Inscription assignRegistrationToCourse(Long numInscription, Long numCours);

    Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours);
}
