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

    @GetMapping("/race/{code}")
    public List<Review> getReviewsByRaceCode(@PathVariable String code) {
        return reviewService.getReviewsByRaceCode(code);
    }

    @PostMapping("/race/{code}")
    public Review addReview(@PathVariable String code, @RequestBody Review newReview) {
        return reviewService.addReview(code, newReview);
    }
}
