package com.pluralsight;

public interface Flyable {
    default void fly(){
        System.out.println("Yippee, I'm flying!");
    };
}
