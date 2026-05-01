package com.raceboxd.backend.exception;

public class RaceNotFoundException extends RuntimeException {
    public RaceNotFoundException(Object identifier) {
        super("Race not found: " + identifier);
    }
}
