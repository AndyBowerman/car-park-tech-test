package org.example;

/*
Small space = capacity 1
Regular space = capacity 2
Large space = capacity 3

Motorcycle = capacity 1
Car = capacity 2
Van = capacity 6

- Tell us how many spots are remaining - getRemainingCapacity()
- Tell us how many total spots are in the parking lot - getTotalCapacity()
- Tell us when the parking lot is full - returnRemainingCapacity()
- Tell us when the parking lot is empty - returnRemainingCapacity()
- Tell us when certain spots are full e.g. when all motorcycle spots are taken
        - remainingMotorCycleSpaces()
        - remainingCarSpaces()
        - remainingVanSpaces()
- Tell us how many spots vans are taking up - returnVehiclesParked()
 */

public class Main {
    public static void main(String[] args) {
        CarPark carPark = new CarPark(10,12,3);
        carPark.addParkedVehicles(3, 5, 2);
        System.out.println(carPark.returnVehiclesParked());
    }
}