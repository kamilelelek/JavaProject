package lesson4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class PersonService {

    public int PERSON_DEFAULT_AGE = 3;

    public int receivePeople(ArrayList<Person> list) {
        Set<Person> persons = new HashSet<>(list);
        return persons.size();
    }

    public Person receiveOldest(ArrayList<Person> list) {
        return list.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .orElse(null);
    }

    public Person receivePerson(ArrayList<Person> list) {
        return list.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .orElse(null);
    }
}
