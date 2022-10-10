package org.example;

/*
Small space = capacity 1
Regular space = capacity 2
Large space = capacity 3

Motorcycle = capacity 1
Car = capacity 2
Van = capacity 6




 */


public class Main {
    public static void main(String[] args) {
        CarPark carPark = new CarPark(10,12,3);
        carPark.addParkedVehicles(3, 5, 2);
        System.out.println(carPark.returnVehiclesParked());
    }
}