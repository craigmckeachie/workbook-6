package com.pluralsight;

public class Drone implements Flyable{
    @Override
    public void fly() {
        System.out.println("The drone hovers and the zips through the air.");
    }

    public void chargeBattery(){
        System.out.println("Charged my battery.");
    }
}
