package com.raceboxd.backend.repository;

import com.raceboxd.backend.model.Race;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RaceRepository extends JpaRepository<Race, Long> {
    Optional<Race> findByCode(String code);
}
