package com.raceboxd.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Race {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    //variables
    private String name;
    private String code;
    private String location;
    private String date;
    private String winner;
    private int season;
    private int round;

    // Constructors
    public Race() {}

    public Race(String code, String name, String date, String location, String winner, int season, int round){
        this.code= code;
        this.name= name;
        this.location= location;
        this.date= date;
        this.winner= winner;
        this.season= season;
        this.round= round;
    }

    //getters and setters
    public Long getId() { return id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getWinner() { return winner; }
    public void setWinner(String winner) { this.winner = winner; }

    public int getSeason() { return season; }
    public void setSeason(int season) { this.season = season; }

    public int getRound() { return round; }
    public void setRound(int round) { this.round = round; }
}