package org.example.ParkingSpaces;

public class LargeParkingSpace extends ParkingSpaces {
    private final int largeCapacity = 6;
    @Override
    public int getCapacity() {
        return largeCapacity;
    }
}
