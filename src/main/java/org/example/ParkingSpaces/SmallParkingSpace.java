package org.example.ParkingSpaces;

public class SmallParkingSpace extends ParkingSpaces {
    private final int smallCapacity = 1;
    @Override
    public int getCapacity() {
        return smallCapacity;
    }
}
