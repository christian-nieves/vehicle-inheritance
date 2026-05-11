package com.pluralsight;

public class Car extends Vehicle {
    private int numberOfDoor;

    public Car(String model, String color, int topSpeed, int fuelCapacity, int numberOfPassengers, int cargoCapacity, int numberOfDoor) {
        super(model, color, topSpeed, fuelCapacity, numberOfPassengers, cargoCapacity);
        this.numberOfDoor = numberOfDoor;
    }

    public void openTrunk() {
        System.out.println("Trunk Opened.");
    }

    public void closeTruck() {
        System.out.println("Trunk Closed.");
    }
}
