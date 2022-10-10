package org.example.Vehicles;

public class Van extends Vehicle {
    private final int spacesTaken = 6;

    public Van() {
        this.vehicleType = "Van";
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
