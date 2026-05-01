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

    @GetMapping("/{raceId}")
    public Race getRaceById(@PathVariable Long raceId) {
        return raceService.getRaceById(raceId);
    }

    @GetMapping("/code/{code}")
    public List<Race> getRacesByCode(@PathVariable String code) {
        return raceService.getRacesByCode(code);
    }

    @PostMapping("/{raceId}/reviews")
    public Review addReview(@PathVariable Long raceId, @RequestBody Review review) {
        return reviewService.addReview(raceId, review);
    }

    @GetMapping("/{raceId}/reviews")
    public List<Review> getReviews(@PathVariable Long raceId) {
        return reviewService.getReviewsByRaceId(raceId);
    }

    @GetMapping("/season/{season}")
    public List<Race> getRacesBySeason(@PathVariable int season) {
        return raceService.getRacesBySeason(season);
    }
}
