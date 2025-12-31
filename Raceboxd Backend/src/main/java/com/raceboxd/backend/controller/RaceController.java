package com.raceboxd.backend.controller;

import com.raceboxd.backend.model.Race;
import com.raceboxd.backend.model.Review;
import com.raceboxd.backend.repository.RaceRepository;
import com.raceboxd.backend.repository.ReviewRepository;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/races")
@CrossOrigin(origins = "http://localhost:3000")
public class RaceController {

    private final RaceRepository raceRepository;
    private final ReviewRepository reviewRepository;

    public RaceController(RaceRepository raceRepository, ReviewRepository reviewRepository) {
        this.raceRepository = raceRepository;
        this.reviewRepository = reviewRepository;
    }

    @GetMapping
    public List<Race> getAllRaces() {
        return raceRepository.findAll();
    }

    @GetMapping("/{code}")
    public Race getRaceByCode(@PathVariable String code) {
        return raceRepository.findByCode(code)
                .orElseThrow(() -> new RuntimeException("Race not found: " + code));
    }

    @PostMapping("/{code}/reviews")
    public Review addReview(@PathVariable String code, @RequestBody Review review) {
        Race race = raceRepository.findByCode(code)
                .orElseThrow(() -> new RuntimeException("Race not found: " + code));
        review.setRace(race);
        return reviewRepository.save(review);
    }

    @GetMapping("/{code}/reviews")
    public List<Review> getReviews(@PathVariable String code) {
    Race race = raceRepository.findByCode(code)
            .orElseThrow(() -> new RuntimeException("Race not found: " + code));
    return reviewRepository.findByRaceId(race.getId());
}
}
