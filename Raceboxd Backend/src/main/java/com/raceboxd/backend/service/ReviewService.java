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
    public Review addReview(String code, Review review) {
        Race race = raceRepo.findByCode(code)
                .orElseThrow(() -> new RaceNotFoundException(code));
        review.setRace(race);
        return reviewRepo.save(review);
    }

    public List<Review> getReviewsByRaceCode(String code) {
        Race race = raceRepo.findByCode(code)
                .orElseThrow(() -> new RaceNotFoundException(code));

        return reviewRepo.findByRaceId(race.getId());
    }
}
