package com.raceboxd.backend.repository;

import com.raceboxd.backend.model.Race;
import com.raceboxd.backend.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByRaceId(Long raceId);
    List<Review> findByRace(Race race);
}
