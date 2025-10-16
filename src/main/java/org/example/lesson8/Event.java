package org.example.lesson8;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Event {
    //nazwa miasto data
    private String name;
    private String town;
    private LocalDate date;


    public Event(String name, String town, LocalDate date) {
        this.name = name;
        this.town = town;
        this.date = date;
    }
}
