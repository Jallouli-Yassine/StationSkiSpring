package tn.esprit.tp2stationskiyassinejallouli4twin7.services.IMPL;

import tn.esprit.tp2stationskiyassinejallouli4twin7.entities.Skieur;
import tn.esprit.tp2stationskiyassinejallouli4twin7.entities.TypeAbonnement;
import tn.esprit.tp2stationskiyassinejallouli4twin7.services.ISkieurService;

import java.util.List;

public class SkieurServiceImpl implements ISkieurService {
    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return null;
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return null;
    }

    @Override
    public void removeSkieur(Long numSkieur) {

    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return null;
    }

    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        return null;
    }

    @Override
    public Skieur addSkierAndAssignToCourse(Skieur skieur, Long numCours) {
        return null;
    }

    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        return null;
    }

    @Override
    public void showMonthlyRecurringRevenue() {

    }
}
