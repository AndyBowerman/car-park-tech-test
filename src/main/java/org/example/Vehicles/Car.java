package org.example.Vehicles;

public class Car extends Vehicle {
    private final int spacesTaken = 2;
    public Car() {
        this.vehicleType = "Car";
    }
    @Override
    public int getSpacesTaken() {
        return spacesTaken;
    }
    @Override
    public String getVehicleType() {
        return vehicleType;
    }
}
