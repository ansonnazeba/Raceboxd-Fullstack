package com.raceboxd.backend.controller;

import com.raceboxd.backend.model.Review;
import com.raceboxd.backend.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public List<Review> getReviews() {
        return reviewService.getReviews();
    }

    @GetMapping("/race/{raceId}")
    public List<Review> getReviewsByRaceId(@PathVariable Long raceId) {
        return reviewService.getReviewsByRaceId(raceId);
    }

    @PostMapping("/race/{raceId}")
    public Review addReview(@PathVariable Long raceId, @RequestBody Review newReview) {
        return reviewService.addReview(raceId, newReview);
    }
}
