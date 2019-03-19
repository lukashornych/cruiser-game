package com.masonorovic.cruiser.objects.car.engine;

public abstract class OverheatProtection {
    protected boolean turnedOn;
    protected int temperature;

    protected OverheatProtection(boolean turnedOn, int temperature) {
        this.turnedOn = turnedOn;
        this.temperature = temperature;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public int getTemperature() {
        return temperature;
    }
}
