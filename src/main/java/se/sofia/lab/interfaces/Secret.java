package se.sofia.lab.interfaces;

public interface Secret {

    default String getSecret() {
        return "VehicleSecret";
    }

    String getAnotherSecret();
}
