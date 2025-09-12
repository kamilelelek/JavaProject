package lesson4;

import java.util.*;

public class Main {
    /**
     *  List -> ArrayList, LinkedList
     *  Set -> Unikalne elementy HashSet / LinkedHashSet / TreeSet
     *  KolejkI -> PrioirtyQueue, ArrayDeque
     *  Mapy -> Kolekcje przechowyjące klucz-wartość HashMap, LikendHashMap, TreeMap
     */

    /*

Stworz klase osoba (imie, nazwisko, wiek), nastepnie stworz metode
ktora jako argument pobiera liste osob i jako wynik zwraca ilosc roznych osob na liscie
(osoby w przekazanej liscie moga sie powtarzac)

Najstarsza osobe na liscie

     */

    static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        ArrayList<String> stringList2 = new ArrayList<>();

        Set<String> stringSet = new HashSet<>();
        HashSet<String> stringSet2 = new HashSet<>();
        Map<Integer, String> stringMap = new HashMap<>();

        stringSet.add("java");
        stringSet.add("javascript");
        stringSet.add("python");
        stringSet.add("java");

        System.out.println(stringSet);

        stringMap.put(1 , "Java");
        stringMap.put(2 , "Python");
        stringMap.put(3 , "C++");
        stringMap.put(1 , "Java22");

        System.out.println(stringMap);

        Person ola = new Person();
        ola.setName("Aleksandra");
        Person mateusz = new Person("Mateusz", "Glanowski", 34);
        Person kamil = new Person("Kamil", "Lelek", 30);

        System.out.println(kamil.getAge());

        System.out.println(ola);
        List<Person> list = new ArrayList<>();
        list.add(mateusz);
        list.add(kamil);
        list.add(ola);
    }

    private int receivPeople(ArrayList<Person> list) {

    }
}
