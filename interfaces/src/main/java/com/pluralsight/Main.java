package com.pluralsight;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flyable> flyingThings = new ArrayList<>();
        flyingThings.add(new Bird());
        flyingThings.add(new Airplane());
        flyingThings.add(new Drone());

        for(Flyable thing: flyingThings){
            thing.fly();
            if(thing instanceof Bird bird){
                bird.buildNest();
            }

        }
    }
}
