package com.pluralsight;

public class Car extends Vehicle {
    private int numberOfDoor;

    public Car(String model, String color, int topSpeed, int fuelCapacity, int numberOfPassengers, int cargoCapacity, int numberOfDoor) {
        super(model, color, topSpeed, fuelCapacity, numberOfPassengers, cargoCapacity);
        this.numberOfDoor = numberOfDoor;
    }

    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    public void setNumberOfDoor(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

    public void openTrunk() {
        System.out.println("Trunk Opened.");
    }

    public void closeTruck() {
        System.out.println("Trunk Closed.");
    }

    @Override
    public String toString() {
        return "Model: " + getModel() + "\n" + "Color: " + getColor() + "\n" + "Doors: " + getNumberOfDoor() + "\n" + "Top Speed: " + getTopSpeed() + "\n" + "Fuel Capacity: " + getFuelCapacity() + "\n" + "Passangers: " + getNumberOfPassengers();
    }
}
