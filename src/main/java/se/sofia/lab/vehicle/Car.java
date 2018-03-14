package se.sofia.lab.vehicle;

public class Car extends Vehicle {


    public Car(String label, String color, FuelType fuelType, int fuelVolume, int yearModel) {
        super(label, color, fuelType, fuelVolume, yearModel);
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }

    @Override
    public String getAnotherSecret() {
        return "AnotherCarSecret";
    }
}
