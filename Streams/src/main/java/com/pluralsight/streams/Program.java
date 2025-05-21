package com.pluralsight.streams;

import com.pluralsight.streams.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> people = getPeople();
        
        String lastName = "Williams";
        List<Person> matchingPeople = getPeopleByLastName(people, lastName);
        printPeople(matchingPeople);

        double averageAge = getAverageAge(people);
        System.out.println("Average age: " + averageAge);
        
        //get just the ages in a list
        List<Integer> ages = getAges(people);

        //Display the age of the oldest person in the list.
        int oldestAge = Collections.max(ages);
        System.out.println(oldestAge);

        //  Display the age of the youngest person in the list.
        int youngestAge = Collections.min(ages);
        System.out.println(youngestAge);




        //sort the people by age

    }

    private static List<Integer> getAges(List<Person> people) {
        List<Integer> ages = new ArrayList<>();
        for (Person person : people) {
            ages.add(person.getAge());
        }
        return ages;
    }

    private static double getAverageAge(List<Person> people) {
        int totalAge = 0;
        for (Person person : people) {
            // totalAge = totalAge + person.getAge();
            totalAge += person.getAge();
        }
        double averageAge = (double) totalAge / people.size();
        return averageAge;
    }

    private static void printPeople(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    private static List<Person> getPeopleByLastName(List<Person> people, String lastName) {
        List<Person> matchingPeople = new ArrayList<>();

        for (Person person : people) {
            if(person.getLastName().equals(lastName)){
                matchingPeople.add(person);
            }
        }
        return matchingPeople;
    }

    private static List<Person> getPeople() {
        List<Person> people = new ArrayList<>();

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

        // Duplicate last names
        people.add(new Person("Jalen", "Williams", 23));
        people.add(new Person("Grant", "Williams", 25));
        people.add(new Person("Jaden", "Ivey", 22));
        people.add(new Person("Keyontae", "Johnson", 24));
        people.add(new Person("Keldon", "Johnson", 24));
        people.add(new Person("Draymond", "Green", 34));
        people.add(new Person("Josh", "Green", 23));
        people.add(new Person("Trey", "Murphy", 24));
        return people;
    }
}
