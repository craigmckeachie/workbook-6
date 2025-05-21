package com.pluralsight.streams;

import com.pluralsight.streams.model.Person;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("LeBron", "James", 39));
        people.add(new Person("Stephen", "Curry", 36));
        people.add(new Person("Kevin", "Durant", 35));
        people.add(new Person("Giannis", "Antetokounmpo", 29));
        people.add(new Person("Joel", "Embiid", 30));
        people.add(new Person("Luka", "Doncic", 25));
        people.add(new Person("Jayson", "Tatum", 26));
        people.add(new Person("Nikola", "Jokic", 29));
        people.add(new Person("Anthony", "Davis", 31));
        people.add(new Person("Jimmy", "Butler", 34));
        people.add(new Person("Kawhi", "Leonard", 32));
        people.add(new Person("Devin", "Booker", 27));

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
