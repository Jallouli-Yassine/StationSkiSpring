package tn.esprit.tp2stationskiyassinejallouli4twin7.services.IMPL;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp2stationskiyassinejallouli4twin7.entities.Piste;
import tn.esprit.tp2stationskiyassinejallouli4twin7.services.IPisteService;

import java.util.List;

@AllArgsConstructor
@Service
public class PisteServiceImpl implements IPisteService {
    @Override
    public List<Piste> retrieveAllPistes() {
        return null;
    }

    @Override
    public Piste addPiste(Piste piste) {
        return null;
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return null;
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return null;
    }
}
