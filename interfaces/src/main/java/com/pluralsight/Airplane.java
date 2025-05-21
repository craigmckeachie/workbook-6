package com.pluralsight;

public class Airplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("The airplane accelerates on the runway and lifts into the sky.");
    }
    public void refuel(){
        System.out.println("I'm filling up. I'm full of gas.");
    }
}
