package com.raceboxd.backend.service;

import com.raceboxd.backend.repository.*;
import com.raceboxd.backend.model.*;
import org.springframework.stereotype.Service;
import com.raceboxd.backend.exception.*;
import java.util.List;

@Service
public class RaceService {
    private final RaceRepository raceRepo;

    public RaceService(RaceRepository raceRepo) {
        this.raceRepo = raceRepo;
    }

    public List<Race> getAllRaces() {
        return raceRepo.findAll();
    }

    public List<Race> getRacesBySeason(int season) {
        return raceRepo.findBySeason(season);
    }

    public Race getRaceById(Long id) {
        return raceRepo.findById(id)
                .orElseThrow(() -> new RaceNotFoundException(id));
    }

    public List<Race> getRacesByCode(String code) {
        List<Race> races = raceRepo.findAllByCode(code);
        if (races.isEmpty()) {
            throw new RaceNotFoundException(code);
        }
        return races;
    }
}
