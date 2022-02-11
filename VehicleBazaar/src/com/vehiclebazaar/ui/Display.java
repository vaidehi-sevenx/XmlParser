package com.vehiclebazaar.ui;

import java.util.List;

import com.vehiclebazaar.data.*;

public class Display {
    public static void printVehicle(List<Vehicle> vehicle) {
        for (Vehicle vehicles : vehicle) {
            System.out.println("Company name\t" +vehicles.getBrand());
            System.out.println("Fuel type\t" +vehicles.getFuelType());
            System.out.println("Colour\t"+vehicles.getColour());
            System.out.println("Price\t"+"Rupees(INR) "+vehicles.getPrice());

            if(vehicles instanceof Car) {
                Car car = (Car) vehicles;
                System.out.println("Number of seats\t"+car.getNumberOfSeats());
                System.out.println("Transmission type\t"+car.getCarType());
                System.out.println("---------------------------------------------");
            }else if(vehicles instanceof Bike) {
                Bike bike = (Bike)vehicles;

                System.out.println("Horse power\t"+bike.getRange()+" cc");
                System.out.println("Tyre type\t"+bike.getTyreType());
                System.out.println("---------------------------------------------");

            }
        }
    }

    
}
