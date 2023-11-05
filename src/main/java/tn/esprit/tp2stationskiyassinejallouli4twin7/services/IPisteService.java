package tn.esprit.tp2stationskiyassinejallouli4twin7.services;

import tn.esprit.tp2stationskiyassinejallouli4twin7.entities.Piste;

import java.util.List;

public interface IPisteService {
    List<Piste> retrieveAllPistes();

    Piste addPiste(Piste piste);
    Piste updatePiste (Piste piste);
    Piste retrievePiste (Long numPiste);
}
