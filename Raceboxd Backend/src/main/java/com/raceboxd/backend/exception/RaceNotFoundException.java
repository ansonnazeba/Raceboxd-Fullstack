package com.raceboxd.backend.exception;

public class RaceNotFoundException extends RuntimeException {
    public RaceNotFoundException(String code) {
        super("Race not found: " + code);
    }
}
