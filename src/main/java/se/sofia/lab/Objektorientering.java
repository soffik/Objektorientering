package se.sofia.lab;

import se.sofia.lab.vehicle.*;

public class Objektorientering {
    // String label, String color, String fuelType, int fuelVolume, int yearModel
    public static void main(String args[]){
        Vehicle mc = new Motorcycle("Yamaha", "Red", FuelType.GAS, 20, 2009);
        Vehicle car = new Car("Saab", "Blue", FuelType.DIESEL, 60, 2004);
        Vehicle truck = new Truck("Scania", "White", FuelType.DIESEL, 200, 2015);

        System.out.println(mc.toString()+car.toString()+truck.toString());
    }


}
