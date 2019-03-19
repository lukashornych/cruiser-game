package com.masonorovic.cruiser.objects.car.engine;

public class FuelPump {
    private String codeName;
    private int maxTorque;
    private int maxRpm;

    public FuelPump(String codeName, int maxTorque, int maxRpm) {
        this.codeName = codeName;
        this.maxTorque = maxTorque;
        this.maxRpm = maxRpm;
    }

    public String getCodeName() {
        return codeName;
    }

    public int getMaxTorque() {
        return maxTorque;
    }

    public int getMaxRpm() {
        return maxRpm;
    }
}
