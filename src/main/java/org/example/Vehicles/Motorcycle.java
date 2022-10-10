package org.example.Vehicles;

import static org.example.Vehicles.VehicleType.motorcycle;

public class Motorcycle extends Vehicle {
    private final int spacesTaken = 1;
    @Override
    public int getSpacesTaken() {
        return spacesTaken;
    }
    @Override
    public VehicleType getVehicleType() {
        return motorcycle;
    }
}
