package se.sofia.lab.vehicle;

import se.sofia.lab.interfaces.Secret;

public abstract class Vehicle implements Secret {

    private String label;
    private String color;
    private FuelType fuelType;
    private int fuelVolume;
    private int yearModel;


    public Vehicle(String label, String color, FuelType fuelType, int fuelVolume, int yearModel) {
        this.label = label;
        this.color = color;
        this.fuelType = fuelType;
        this.fuelVolume = fuelVolume;
        this.yearModel = yearModel;
    }


    public abstract String getVehicleType();

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder
                .append("\n\nlabel: ")
                .append(label)
                .append("\ncolor: ")
                .append(color)
                .append("\nfuelType: ")
                .append(fuelType)
                .append("\nfuelVolume: ")
                .append(fuelVolume)
                .append("\nyearModel: ")
                .append(yearModel)
                .append("\nvehicleType: ")
                .append(getVehicleType())
                .append("\nsecret: ")
                .append(getSecret())
                .append("\nanotherSecret: ")
                .append(getAnotherSecret());

        return builder.toString();
    }
}
