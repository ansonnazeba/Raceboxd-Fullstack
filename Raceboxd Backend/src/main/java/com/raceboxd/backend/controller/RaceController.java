package com.raceboxd.backend.controller;

import com.raceboxd.backend.model.Race;
import com.raceboxd.backend.model.Review;
import com.raceboxd.backend.service.*;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/races")
@CrossOrigin(origins = "http://localhost:3000")
public class RaceController {

    private final RaceService raceService;
    private final ReviewService reviewService;

    public RaceController(RaceService raceService, ReviewService reviewService) {
        this.raceService = raceService;
        this.reviewService = reviewService;
    }

    @GetMapping
    public List<Race> getAllRaces() {
        return raceService.getAllRaces();
    }

    @GetMapping("/{code}")
    public Race getRaceByCode(@PathVariable String code) {
        return raceService.getRaceByCode(code);
    }

    @PostMapping("/{code}/reviews")
    public Review addReview(@PathVariable String code, @RequestBody Review review) {
        return reviewService.addReview(code, review);
    }

    @GetMapping("/{code}/reviews")
    public List<Review> getReviews(@PathVariable String code) {
        return reviewService.getReviewsByRaceCode(code);
    }

    @GetMapping("/season/{season}")
    public List<Race> getRacesBySeason(@PathVariable int season) {
        return raceService.getRacesBySeason(season);
    }
}
