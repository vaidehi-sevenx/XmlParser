package com.vehiclebazaar.data;

import com.vehiclebazaar.db.Database;

import java.util.List;

public class Main {
    public static void main() throws Exception {

        List<Vehicle> vehicles =XmlParser.getVehicle();
        System.out.println("--------------------------------------------------------");

        Database.sendDatabase(vehicles);

    }
    
}
