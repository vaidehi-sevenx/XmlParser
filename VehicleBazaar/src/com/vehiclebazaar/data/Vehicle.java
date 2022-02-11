package com.vehiclebazaar.data;

import jakarta.xml.bind.annotation.*;
@XmlRootElement (name = "vehicle")
@XmlAccessorType (XmlAccessType.FIELD)

public class Vehicle {
    private String brand;
    private String fuelType;
    private String colour;
    private int price;

    //methods

    public Vehicle(){

    }
    public Vehicle(String brand, String colour, String fuelType, int price){
        
        this.brand = brand;
        this.colour = colour;
        this.fuelType= fuelType;
        this.price= price;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }


}
    

