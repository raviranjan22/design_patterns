package com.syntaxadda.factorydesignpattern;

public class Main {
    public static void main(String[] args) {
        /*Vehicle car = new Car();
        car.drive();

        Vehicle bike = new Bike();
        bike.drive();*/

        VehicleFactory factory = new VehicleFactory();
        Vehicle vehicle = factory.createVehicle("BICYCLE");
        if(vehicle != null){
            vehicle.drive();
        }else{
            System.out.println("Factory does not manufacture this object");
        }

    }
}
