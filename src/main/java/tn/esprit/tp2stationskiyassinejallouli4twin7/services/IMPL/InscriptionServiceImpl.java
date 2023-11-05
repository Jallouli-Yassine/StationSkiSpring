package tn.esprit.tp2stationskiyassinejallouli4twin7.services.IMPL;

import tn.esprit.tp2stationskiyassinejallouli4twin7.entities.Inscription;
import tn.esprit.tp2stationskiyassinejallouli4twin7.services.IInscriptionService;

import java.util.List;

public class InscriptionServiceImpl implements IInscriptionService {
    @Override
    public List<Inscription> retrieveAllINSCs() {
        return null;
    }

    @Override
    public Inscription addInscription(Inscription insc) {
        return null;
    }

    @Override
    public Inscription updateInscription(Inscription insc) {
        return null;
    }

    @Override
    public Inscription retrieveInscription(Long numInscription) {
        return null;
    }

    @Override
    public Inscription addRegistrationAndAssignToSkier(Inscription inscription, Long numSkieur) {
        return null;
    }

    @Override
    public Inscription assignRegistrationToCourse(Long numInscription, Long numCours) {
        return null;
    }

    @Override
    public Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours) {
        return null;
    }
}
