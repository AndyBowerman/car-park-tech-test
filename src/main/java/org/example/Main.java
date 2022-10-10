package org.example;

/*
small - motorbike, 2 fits a car, 6 fits a van
medium - cars, motorbikes or 3 for a van
large - 3 medium spaces - one van, 3 cars, 3 bikes

Car park
3 spaces
vehicle
3 vehicle types extending vehicle

car park holds number available
    - return number of spaces
    - return number available
    - holds number of vehicles added
    - returns true or false if car park is full
    - returns true or false if car park is empty
    - says how many of each vehicle type is there
    - says how many of each vehicle it can fit as a max e.g. 10 vans or 30 cars or motorcycles

each vehicle represents a number
Must generate car park

 */

import org.example.Vehicles.Car;
import org.example.Vehicles.Motorcycle;

public class Main {
    public static void main(String[] args) {
        CarPark carPark = new CarPark();
        carPark.generateCarPark(1, 1, 1);
        System.out.println(carPark.getTotalCapacity());
        System.out.println(carPark.remainingMotorcycleSpaces());
        System.out.println(carPark.remainingCarSpaces());
        System.out.println(carPark.remainingVanSpaces());
        System.out.println("----------------------------");
        carPark.addParkedVehicles(new Car());
        System.out.println(carPark.amendCapacity());
    }
}