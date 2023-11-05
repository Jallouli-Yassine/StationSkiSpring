package tn.esprit.tp2stationskiyassinejallouli4twin7.services.IMPL;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp2stationskiyassinejallouli4twin7.entities.Abonnement;
import tn.esprit.tp2stationskiyassinejallouli4twin7.entities.TypeAbonnement;
import tn.esprit.tp2stationskiyassinejallouli4twin7.services.IAbonnementService;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
public class AbonnementServiceImpl implements IAbonnementService {
    @Override
    public List<Abonnement> retrieveAllABs() {
        return null;
    }

    @Override
    public Abonnement addAbonnement(Abonnement ab) {
        return null;
    }

    @Override
    public Abonnement updateAbonnement(Abonnement ab) {
        return null;
    }

    @Override
    public Abonnement retrieveAbonnement(Long numAb) {
        return null;
    }

    @Override
    public Set<Abonnement> getSubscriptionByType(TypeAbonnement type) {
        return null;
    }

    @Override
    public List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate) {
        return null;
    }

    @Override
    public void retrieveSubscriptions() {

    }
}
