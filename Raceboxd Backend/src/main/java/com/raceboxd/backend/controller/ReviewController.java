package com.raceboxd.backend.controller;

import com.raceboxd.backend.model.Review;
import com.raceboxd.backend.model.Race;
import com.raceboxd.backend.repository.ReviewRepository;
import com.raceboxd.backend.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private RaceRepository raceRepository;

    @GetMapping
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @GetMapping("/race/{raceId}")
    public List<Review> getReviewsByRace(@PathVariable Long raceId) {
        return reviewRepository.findByRaceId(raceId);
    }

    @PostMapping("/race/{raceId}")
    public Review addReview(@PathVariable Long raceId, @RequestBody Review newReview) {
        Optional<Race> raceOptional = raceRepository.findById(raceId);
        if (raceOptional.isPresent()) {
            newReview.setRace(raceOptional.get());
            return reviewRepository.save(newReview);
        } else {
            throw new RuntimeException("Race not found with id " + raceId);
        }
    }
}
