package com.masonorovic.cruiser.objects.car.engine;

public class Valves {
    private String codeName;
    private int maxRpm;
    private float damage;
    private String engineCodeName;

    public Valves(String codeName, int maxRpm, float damage, String engineCodeName) {
        this.codeName = codeName;
        this.maxRpm = maxRpm;
        this.damage = damage;
        this.engineCodeName = engineCodeName;
    }

    public String getCodeName() {
        return codeName;
    }

    public int getMaxRpm() {
        return maxRpm;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public String getEngineCodeName() {
        return engineCodeName;
    }
}
