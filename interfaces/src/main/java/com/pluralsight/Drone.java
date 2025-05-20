package com.pluralsight;

public class Drone implements Flyable{
    @Override
    public void fly() {
        System.out.println("The drone hovers and the zips through the air.");
    }
}
