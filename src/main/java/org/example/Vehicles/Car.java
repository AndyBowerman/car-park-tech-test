package org.example.Vehicles;

import static org.example.Vehicles.VehicleType.car;

public class Car extends Vehicle {
    private final int spacesTaken = 2;
    @Override
    public int getSpacesTaken() {
        return spacesTaken;
    }
    @Override
    public VehicleType getVehicleType() {
        return car;
    }
}
