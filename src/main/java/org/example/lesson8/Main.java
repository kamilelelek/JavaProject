package org.example.lesson8;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Event> events = new ArrayList<Event>();
        events.add(new Event("metalica", "Rzeszow", LocalDate.of(2025, Month.OCTOBER, 8)));
        events.add(new Event("Dawid Podsiadlo", "Krakow", LocalDate.of(2023, Month.SEPTEMBER, 12)));
        events.add(new Event("Quebonafide", "Warszawa", LocalDate.of(2025, Month.AUGUST, 22)));
        events.add(new Event("Taco Hemingway", "Gdansk", LocalDate.of(2023, Month.APRIL, 23)));
        events.add(new Event("Festiwal smokow", "Krakow", LocalDate.of(2024, Month.JULY, 1)));

    /*
    Stworz klase Wydarzenie (nazwa, miasto, data)
    - stworz metode ktora z podanej jako argument listy wydarzen zwroci miasto w ktorym bylo najwiecej wydarzen na liscie
    - stworz metode ktora z podanej jako argument listy wydarzen zwroci rok w ktorym bylo najwiecej wydarzen na liscie - TAKIE SAMO
    */


    }

    public static void receiveTown(List<Event> events) {
        Map<String, Integer> stringMap = new HashMap<>();
    }
}