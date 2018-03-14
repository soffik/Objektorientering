package se.sofia.lab.vehicle;

public enum FuelType {

    DIESEL("Diesel"),
    GAS("Gas"),
    ETANOL("Etanol"),
    UNKNOWN("Unknown");

    private String type;

    FuelType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return type;
    }
}
