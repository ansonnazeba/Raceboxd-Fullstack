package com.raceboxd.backend.repository;

import com.raceboxd.backend.model.Race;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RaceRepository extends JpaRepository<Race, Long> {
    List<Race> findAllByCode(String code);
    List<Race> findBySeason(int season);
}
