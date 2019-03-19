package com.masonorovic.cruiser.objects.car.engine;

public class Intercooler {
    private String codeName;
    private int maxBoostPressure;

    public Intercooler(String codeName, int maxBoostPressure) {
        this.codeName = codeName;
        this.maxBoostPressure = maxBoostPressure;
    }

    public String getCodeName() {
        return codeName;
    }

    public int getMaxBoostPressure() {
        return maxBoostPressure;
    }
}
