package se.sofia.lab.vehicle;

public class Motorcycle extends Vehicle {

    public Motorcycle(String label, String color, FuelType fuelType, int fuelVolume, int yearModel) {
        super(label, color, fuelType, fuelVolume, yearModel);
    }

    @Override
    public String getVehicleType() {
        return "Motorcycle";
    }

    @Override
    public String getAnotherSecret() {
        return "AnotherMotorcycleSecret";
    }

}
