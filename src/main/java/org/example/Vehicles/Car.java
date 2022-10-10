package org.example.Vehicles;

public class Car extends Vehicle {
    private final int spacesTaken = 2;
    @Override
    public int getSpacesTaken() {
        return spacesTaken;
    }
}
