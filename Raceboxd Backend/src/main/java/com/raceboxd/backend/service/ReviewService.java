package com.raceboxd.backend.service;

import com.raceboxd.backend.exception.RaceNotFoundException;
import com.raceboxd.backend.model.*;
import com.raceboxd.backend.repository.RaceRepository;
import com.raceboxd.backend.repository.ReviewRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepo;
    private final RaceRepository raceRepo;

    public ReviewService(ReviewRepository reviewRepo, RaceRepository raceRepo) {
        this.reviewRepo = reviewRepo;
        this.raceRepo = raceRepo;
    }

    //methods
    public List<Review> getReviews() {
        return reviewRepo.findAll();
    }
    public Review addReview(Long raceId, Review review) {
        Race race = raceRepo.findById(raceId)
                .orElseThrow(() -> new RaceNotFoundException(raceId));
        review.setRace(race);
        return reviewRepo.save(review);
    }

    public List<Review> getReviewsByRaceId(Long raceId) {
        Race race = raceRepo.findById(raceId)
                .orElseThrow(() -> new RaceNotFoundException(raceId));

        return reviewRepo.findByRaceId(race.getId());
    }
}
