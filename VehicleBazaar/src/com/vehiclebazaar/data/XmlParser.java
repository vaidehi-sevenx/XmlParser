package com.vehiclebazaar.data;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.util.List;

public class XmlParser {
    public static List<Vehicle> getVehicle() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Vehicles.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Vehicles vehicles = (Vehicles) unmarshaller.unmarshal(new File(""));
        List<Vehicle> vehicleList = vehicles.getVehicles();
        return vehicleList;
    }
    
}
