package com.masonorovic.cruiser.objects.car.engine;

public class Radiator {
    private String codeName;
    private int maxTorque;

    public Radiator(String codeName, int maxTorque) {
        this.codeName = codeName;
        this.maxTorque = maxTorque;
    }

    public String getCodeName() {
        return codeName;
    }

    public int getMaxTorque() {
        return maxTorque;
    }
}
