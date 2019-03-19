package com.masonorovic.cruiser.objects.car.engine;

public class Camshaft {
    private String codeName;
    private float torqueIncrease;

    public Camshaft(String codeName, float torqueIncrease) {
        this.codeName = codeName;
        this.torqueIncrease = torqueIncrease;
    }

    public String getCodeName() {
        return codeName;
    }

    public float getTorqueIncrease() {
        return torqueIncrease;
    }
}
