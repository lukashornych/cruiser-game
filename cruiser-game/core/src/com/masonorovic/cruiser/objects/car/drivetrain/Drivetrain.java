package com.masonorovic.cruiser.objects.car.drivetrain;

public class Drivetrain {
    private float maxTiresDiameter;

    private Transmission transmission;
    private Tires tires;
    private Differential differential;
    private Brakes brakes;

    public Drivetrain(float maxTiresDiameter, Transmission transmission, Tires tires, Differential differential, Brakes brakes) {
        this.maxTiresDiameter = maxTiresDiameter;
        this.transmission = transmission;
        this.tires = tires;
        this.differential = differential;
        this.brakes = brakes;
    }

    public float getMaxTiresDiameter() {
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

    public Brakes getBrakes() {
        return brakes;
    }

    public void setBrakes(Brakes brakes) {
        this.brakes = brakes;
    }
}
