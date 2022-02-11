package com.vehiclebazaar.db;

import com.vehiclebazaar.data.Vehicle;
import com.vehiclebazaar.data.Vehicles;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Vehicle> getVehicle() throws SQLException {
        String username = "root";
        String password = "Pranit@123";
        String url = "jdbc:mysql://localhost:3306/vehiclebazaar";
        List<Vehicle> vehicles = new ArrayList<>();
        Connection con = DriverManager.getConnection(url, username, password);

        Statement st = con.createStatement();
        ResultSet rc = st.executeQuery("Select * from vehicle");

//vehicleType,brand,model,colour,fuelType,price,maximumSpeed,review,horsePower,numberOfSeats,brakeType
        while(rc.next()){
            String brand = rc.getString("brand");
            String colour = rc.getString("colour");
            String fuelType = rc.getString("fuelType");
            int price = rc.getInt("price");
            vehicles.add(new Vehicle(brand,colour,fuelType,price));
        }
        con.close();
        return vehicles;
    }

    public  static  void sendDatabase( List<Vehicle> vehicles) throws SQLException {
        String username = "root";
        String password = "123456";
        String url = "";

        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        for(Vehicle vehicle: vehicles){
            String Query = String.format("Insert into vehicle (brand,colour,fuelType,price) values ('Toyota','Silver','Petrol',500000)");

            st.executeUpdate(Query);
        }
    }
    
}
