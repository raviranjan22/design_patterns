package com.syntaxadda.factorydesignpattern;

public class VehicleFactory {
    public Vehicle createVehicle(String type){
        if(type.equals("CAR"))
            return new Car();
        else if(type.equals("BIKE"))
            return new Bike();
        else
            return null;
    }
}
