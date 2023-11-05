package tn.esprit.tp2stationskiyassinejallouli4twin7.services;

import tn.esprit.tp2stationskiyassinejallouli4twin7.entities.Moniteur;
import tn.esprit.tp2stationskiyassinejallouli4twin7.entities.Support;

import java.util.List;

public interface IMoniteurService {
    List<Moniteur> retrieveAllMoniteurs();

    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur (Moniteur moniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);

    Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCours);
    List<Integer> numWeeksCourseOfInstructorBySupport(Long numInstructor, Support support);


}
