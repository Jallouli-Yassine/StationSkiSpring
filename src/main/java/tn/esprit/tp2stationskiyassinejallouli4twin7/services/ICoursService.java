package tn.esprit.tp2stationskiyassinejallouli4twin7.services;

import tn.esprit.tp2stationskiyassinejallouli4twin7.entities.Cours;

import java.util.List;

public interface ICoursService {
    List<Cours> retrieveAllCourses();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Cours retrieveCours (Long numCours);
}
