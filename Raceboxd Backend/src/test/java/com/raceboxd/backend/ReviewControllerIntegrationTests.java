package com.raceboxd.backend;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.raceboxd.backend.model.Race;
import com.raceboxd.backend.model.Review;
import com.raceboxd.backend.repository.RaceRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ReviewControllerIntegrationTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private RaceRepository raceRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void addsReviewByRaceId() throws Exception {
        Race race = raceRepository.findAll().stream()
                .findFirst()
                .orElseThrow();

        Review review = new Review();
        review.setRating(5);
        review.setReview("Instant classic");

        mockMvc.perform(post("/api/reviews/race/{raceId}", race.getId())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(review)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.rating").value(5))
                .andExpect(jsonPath("$.review").value("Instant classic"))
                .andExpect(jsonPath("$.race.id").value(race.getId()));
    }

    @Test
    void getsAllRacesForSharedCode() throws Exception {
        mockMvc.perform(get("/api/races/code/{code}", "bahrain"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(5)));
    }

    @Test
    void returnsJsonWhenRaceIsMissing() throws Exception {
        mockMvc.perform(get("/api/reviews/race/{raceId}", Long.MAX_VALUE))
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.status").value(404))
                .andExpect(jsonPath("$.message").value("Race not found: " + Long.MAX_VALUE));
    }
}
