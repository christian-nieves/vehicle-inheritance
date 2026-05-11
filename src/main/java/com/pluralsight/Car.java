package com.pluralsight;

public class Car extends Vehicle {
    private int numberOfDoor;

    public void openTrunk() {
        System.out.println("Trunk Opened.");
    }

    public void closeTruck() {
        System.out.println("Trunk Closed.");
    }
}
