package tn.esprit.tp2stationskiyassinejallouli4twin7.services.IMPL;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp2stationskiyassinejallouli4twin7.entities.Moniteur;
import tn.esprit.tp2stationskiyassinejallouli4twin7.entities.Support;
import tn.esprit.tp2stationskiyassinejallouli4twin7.services.IMoniteurService;

import java.util.List;

@AllArgsConstructor
@Service
public class MoniteurServiceImpl implements IMoniteurService {
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return null;
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return null;
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return null;
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return null;
    }

    @Override
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCours) {
        return null;
    }

    @Override
    public List<Integer> numWeeksCourseOfInstructorBySupport(Long numInstructor, Support support) {
        return null;
    }
}
