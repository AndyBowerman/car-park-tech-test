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

import static org.example.Vehicles.VehicleType.*;

public class CarPark {
    private int totalCapacity;
    private int remainingCapacity;
    private List<ParkingSpaces> parkingSpaces = new ArrayList<>();
    private List<Vehicle> parkedVehicles = new ArrayList<>();

    public CarPark(int smallSpaces, int regularSpaces, int largeSpaces) {
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
        amendCapacity();
    }

    public String getTotalCapacity() {
        return totalCapacity + " spaces in the car park.";
    }

    private void setTotalCapacity() {
        for (int i = 0; i < parkingSpaces.size(); i++) {
            this.totalCapacity += parkingSpaces.get(i).getCapacity();
        }
    }

    public String getRemainingCapacity() {
        return remainingCapacity + " spaces available.";
    }

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
        if(remainingCapacity % 6 == 0) {
            remaining = remainingCapacity / new Van().getSpacesTaken();
            leftOver = 0;
        } else {
            remaining = remainingCapacity / 6;
            leftOver = remainingCapacity - (remaining * 6);
        }
        return "You can fit " + remaining + " more vans with " + leftOver + " small spaces remaining.";
    }
    private void amendCapacity() {
        int count = 0;
        for (int i = 0; i < parkedVehicles.size(); i++) {
            count += parkedVehicles.get(i).getSpacesTaken();
        }
        remainingCapacity = totalCapacity - count;
    }
    public void addParkedVehicles(int motorcycles, int cars, int vans) {
        if((motorcycles + (cars*2) + (vans*6)) > remainingCapacity) {
            System.out.println("There aren't enough spaces!");
            System.out.println("There are " + remainingCapacity + " spaces left.");
        } else {
            int i = 0;
            while(i < motorcycles) {
                parkedVehicles.add(new Motorcycle());
                i++;
            }
            int j = 0;
            while(j < cars) {
                parkedVehicles.add(new Car());
                j++;
            }
            int k = 0;
            while(k < vans) {
                parkedVehicles.add(new Van());
                k++;
            }
            amendCapacity();
        }
    }
    public void addParkingSpaces(ParkingSpaces space) {
        parkingSpaces.add(space);
    }

    public boolean isFull() {
        return remainingCapacity == 0;
    }

    public boolean isEmpty() {
        return remainingCapacity == totalCapacity;
    }

    public String returnRemainingCapacity() {
        if(isFull()) {
            return "The car park is full!";
        } else if(isEmpty()) {
            return "The car park is empty!";
        } else {
            return "There are currently " + (totalCapacity - remainingCapacity) + " spaces occupied, with " + remainingCapacity + " remaining.";
        }
    }

    public String returnVehiclesParked() {
        int motorcycles = 0;
        int cars = 0;
        int vans = 0;
        for (int i = 0; i < parkedVehicles.size(); i++) {
            if(parkedVehicles.get(i).getVehicleType() == motorcycle) {
                motorcycles++;
            } else if(parkedVehicles.get(i).getVehicleType().equals(car)) {
                cars++;
            } else if(parkedVehicles.get(i).getVehicleType().equals(van)) {
                vans++;
            }
        }
        return "There are " + motorcycles + " motorcycles taking up " + motorcycles + " spots, " +
                cars + " cars taking up " + cars * 2 + " spots and " +
                vans + " vans taking up " + vans * 6 + " spots.";
    }
}
