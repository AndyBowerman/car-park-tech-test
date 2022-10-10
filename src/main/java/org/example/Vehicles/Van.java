package org.example.Vehicles;

import static org.example.Vehicles.VehicleType.van;

public class Van extends Vehicle {
    private final int spacesTaken = 6;
    @Override
    public int getSpacesTaken() {
        return spacesTaken;
    }
    @Override
    public VehicleType getVehicleType() {
        return van;
    }
}
