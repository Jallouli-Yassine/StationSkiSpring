package tn.esprit.tp2stationskiyassinejallouli4twin7.services.IMPL;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp2stationskiyassinejallouli4twin7.entities.Cours;
import tn.esprit.tp2stationskiyassinejallouli4twin7.services.ICoursService;

import java.util.List;

@AllArgsConstructor
@Service
public class CoursServiceImpl implements ICoursService {
    @Override
    public List<Cours> retrieveAllCourses() {
        return null;
    }

    @Override
    public Cours addCours(Cours cours) {
        return null;
    }

    @Override
    public Cours updateCours(Cours cours) {
        return null;
    }

    @Override
    public Cours retrieveCours(Long numCours) {
        return null;
    }
}
