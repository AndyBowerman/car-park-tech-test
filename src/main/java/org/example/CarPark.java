package org.example;

import org.example.ParkingSpaces.LargeParkingSpace;
import org.example.ParkingSpaces.ParkingSpaces;
import org.example.ParkingSpaces.RegularParkingSpace;
import org.example.ParkingSpaces.SmallParkingSpace;
import org.example.Vehicles.Car;
import org.example.Vehicles.Motorcycle;
import org.example.Vehicles.Van;
import org.example.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;



public class CarPark {
    private int totalCapacity;
    private int remainingCapacity = 65;
    private List<ParkingSpaces> parkingSpaces = new ArrayList<>();
    private List<Vehicle> parkedVehicles = new ArrayList<>();

    public void generateCarPark(int smallSpaces, int regularSpaces, int largeSpaces) {
        int i = 0;
        while (i < smallSpaces) {
            addParkingSpaces(new SmallParkingSpace());
            i++;
        }
        int j = 0;
        while (j < regularSpaces) {
            addParkingSpaces(new RegularParkingSpace());
            j++;
        }
        int k = 0;
        while (k < largeSpaces) {
            addParkingSpaces(new LargeParkingSpace());
            k++;
        }
        setTotalCapacity();
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity() {
        for (int i = 0; i < parkingSpaces.size(); i++) {
            this.totalCapacity += parkingSpaces.get(i).getCapacity();
        }
    }

    /*
How many vehicles of each type could park and return remainder

 */

    public String remainingMotorcycleSpaces() {
        int remaining = remainingCapacity / new Motorcycle().getSpacesTaken();
        return "You can fit " + remaining + " more motorcycles with no spaces remaining.";
    }
    public String remainingCarSpaces() {
        int remaining;
        int leftOver;
        if(remainingCapacity % 2 == 0) {
            remaining = remainingCapacity / new Car().getSpacesTaken();
            leftOver = 0;
        } else {
            remaining = (remainingCapacity - 1) / new Car().getSpacesTaken();
            leftOver = 1;
        }
        return "You can fit " + remaining + " more cars with " + leftOver + " small spaces remaining.";
    }

    public String remainingVanSpaces() {
        int remaining;
        int leftOver;
        if(remainingCapacity % 3 == 0) {
            remaining = remainingCapacity / new Van().getSpacesTaken();
            leftOver = 0;
        } else {
            remaining = remainingCapacity / 3;
            leftOver = remainingCapacity - (remaining * 3);
        }
        return "You can fit " + remaining + " more vans with " + leftOver + " small spaces remaining.";
    }

    public int amendCapacity() {
        int count = 0;
        for (int i = 0; i < parkedVehicles.size(); i++) {
            count += parkedVehicles.get(i).getSpacesTaken();
        }
        return count;
    }

    public void addParkedVehicles(Vehicle vehicle) {
        parkedVehicles.add(vehicle);
    }

    public void addParkingSpaces(ParkingSpaces space) {
        parkingSpaces.add(space);
    }
}
