package org.example.Vehicles;

public class Motorcycle extends Vehicle {
    private final int spacesTaken = 1;

    public Motorcycle() {
        this.vehicleType = "Motorcycle";
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
