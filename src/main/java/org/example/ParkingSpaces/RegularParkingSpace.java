package org.example.ParkingSpaces;

public class RegularParkingSpace extends ParkingSpaces {
    private final int regularCapacity = 2;
    @Override
    public int getCapacity() {
        return regularCapacity;
    }
}
