package com.masonorovic.cruiser.objects.car.engine;

public class Camshaft {
    private String codeName;
    private float torqueIncrease;
    private String engineCodeName;

    public Camshaft(String codeName, float torqueIncrease, String engineCodeName) {
        this.codeName = codeName;
        this.torqueIncrease = torqueIncrease;
        this.engineCodeName = engineCodeName;
    }

    public String getCodeName() {
        return codeName;
    }

    public float getTorqueIncrease() {
        return torqueIncrease;
    }

    public String getEngineCodeName() {
        return engineCodeName;
    }
}
