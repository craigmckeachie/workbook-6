package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Flyable[] flyingThings = { new Bird(), new Airplane(), new Drone() };

        for(Flyable thing: flyingThings){
            thing.fly();
        }
    }
}
