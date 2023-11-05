package tn.esprit.tp2stationskiyassinejallouli4twin7.services;

import tn.esprit.tp2stationskiyassinejallouli4twin7.entities.Skieur;
import tn.esprit.tp2stationskiyassinejallouli4twin7.entities.TypeAbonnement;

import java.util.List;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);
    void removeSkieur (Long numSkieur);
    Skieur retrieveSkieur (Long numSkieur);

    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);

    Skieur addSkierAndAssignToCourse(Skieur skieur, Long numCours);

    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);

    public void showMonthlyRecurringRevenue();
}
