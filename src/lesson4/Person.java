package lesson4;


import java.util.Objects;

public class Person {

    // SOLID i KISS
    // Kontrakt hashcode & equals
    //nauczyc sie gettery settery i constructory (bezparametrowe

    private String name;
    private String surename;
    private int age;

    public Person() {
    }

    public Person(String name, String surename, int age) {
        this.name = name;
        this.surename = surename;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surename, person.surename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surename, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", age=" + age +
                '}';
    }

}
