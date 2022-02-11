package com.vehiclebazaar.data;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;
@XmlRootElement (name = "vehicles")
@XmlAccessorType (XmlAccessType.FIELD)

public class Vehicles {
    @XmlElement(name = "vehicle")
    private List<Vehicle> vehicles = null;


    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    
}
