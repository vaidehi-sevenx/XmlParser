package com.vehiclebazaar.VehicleBazaar;

import java.util.ArrayList;
import java.util.List;

import com.vehiclebazaar.data.Bike;
import com.vehiclebazaar.data.Car;
import com.vehiclebazaar.data.GenerateVehicleOutput;
import com.vehiclebazaar.data.Vehicle;
import com.vehiclebazaar.data.XmlParser;
import com.vehiclebazaar.db.Database;
import com.vehiclebazaar.ui.Display;

public class VehicleBazaarMain {

    public static void main(String[]args) throws Exception {


        Car car = new Car();
        Bike bike = new Bike();
        System.out.println("---------------------------Welcome to Vehiclebazaar.com----------------------");



        car.setBrand("Toyota");
        car.setColour("Silver");
        car.setFuelType("Petrol");
        car.setPrice(2000000);

        bike.setBrand("Bajaj");
        bike.setColour("black");
        bike.setFuelType("Petrol");
        bike.setPrice(100000);

        List<Vehicle> list = new ArrayList<Vehicle>();
        list.add(car);
        list.add(bike);


        Display.printVehicle(list);

        List<Vehicle> vehicles =XmlParser.getVehicle();
        System.out.println("--------------------------------------------------------");

        Database.sendDatabase(vehicles);
        GenerateVehicleOutput.printVehicleOutput(vehicles);


    }


}