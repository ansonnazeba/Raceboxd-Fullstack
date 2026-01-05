package com.raceboxd.backend.service;

import com.raceboxd.backend.repository.*;
import com.raceboxd.backend.model.*;
import org.springframework.stereotype.Service;
import com.raceboxd.backend.exception.*;
import java.util.List;

@Service
public class RaceService {
    private final RaceRepository raceRepo;
//    private final ReviewService revService;

    public RaceService(RaceRepository raceRepo) {
        this.raceRepo = raceRepo;
    }

    public List<Race> getAllRaces() {
        return raceRepo.findAll();
    }

    public List<Race> getRacesBySeason(int season) {
        return raceRepo.findBySeason(season);
    }

    public Race getRaceByCode(String code) {
        return raceRepo.findByCode(code)
                .orElseThrow(() -> new RaceNotFoundException(code));
    }
}
