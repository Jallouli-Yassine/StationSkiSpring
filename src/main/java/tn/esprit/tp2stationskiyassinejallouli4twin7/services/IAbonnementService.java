package tn.esprit.tp2stationskiyassinejallouli4twin7.services;

import tn.esprit.tp2stationskiyassinejallouli4twin7.entities.Abonnement;
import tn.esprit.tp2stationskiyassinejallouli4twin7.entities.Moniteur;
import tn.esprit.tp2stationskiyassinejallouli4twin7.entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface IAbonnementService {
    List<Abonnement> retrieveAllABs();

    Abonnement addAbonnement(Abonnement ab);
    Abonnement updateAbonnement (Abonnement ab);
    Abonnement retrieveAbonnement (Long numAb);

    Set<Abonnement> getSubscriptionByType(TypeAbonnement type);

    List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate);

    void retrieveSubscriptions();
}
