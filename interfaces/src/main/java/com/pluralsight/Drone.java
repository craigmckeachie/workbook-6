package com.pluralsight;

public class Drone implements Flyable, Rechargeable{
//    @Override
//    public void fly() {
//        System.out.println("The drone hovers and the zips through the air.");
//    }

    public void streamVideo(){
        System.out.println("Get off of YouTube");
    }

    @Override
    public void charge() {
        System.out.println("I'm charging ahead.");
    }
}
