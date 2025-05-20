package com.pluralsight;

public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("The bird flaps its wings and takes off.");
    }
}
