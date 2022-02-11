package com.vehiclebazaar.data;

import java.util.List;

public class GenerateVehicleOutput {
    public static void printVehicleOutput(List<Vehicle> vehicles){
        for(Vehicle vehicle: vehicles){
            System.out.println("Brand: \t" + vehicle.getBrand());;
            System.out.println("------------------------------");
        }
    }
    
}
