package se.sofia.lab.vehicle;

public class Truck extends Vehicle {

    public Truck(String label, String color, FuelType fuelType, int fuelVolume, int yearModel) {
        super(label, color, fuelType, fuelVolume, yearModel);
    }

    @Override
    public String getVehicleType() {
        return "Truck";
    }

    @Override
    public String getSecret(){
        return "TruckSecret";
    }

    @Override
    public String getAnotherSecret() {
        return "AnotherTruckSecret";
    }

}
