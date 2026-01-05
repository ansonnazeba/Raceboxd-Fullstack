package com.raceboxd.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RaceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleRaceNotFound(RaceNotFoundException ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(ReviewNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleReviewNotFound(ReviewNotFoundException ex) {
        return ex.getMessage();
    }
}
