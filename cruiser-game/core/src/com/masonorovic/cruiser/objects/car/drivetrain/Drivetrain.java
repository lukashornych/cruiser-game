package com.masonorovic.cruiser.objects.car.drivetrain;

public class Drivetrain {
    private int maxTiresDiameter;

    private Transmission transmission;
    private Tires tires;
    private Differential differential;

    public Drivetrain(int maxTiresDiameter, Transmission transmission, Tires tires, Differential differential) {
        this.maxTiresDiameter = maxTiresDiameter;
        this.transmission = transmission;
        this.tires = tires;
        this.differential = differential;
    }

    public int getMaxTiresDiameter() {
        return maxTiresDiameter;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }

    public Differential getDifferential() {
        return differential;
    }

    public void setDifferential(Differential differential) {
        this.differential = differential;
    }
}
