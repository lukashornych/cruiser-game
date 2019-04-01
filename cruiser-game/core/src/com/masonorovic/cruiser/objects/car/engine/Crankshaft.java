package com.masonorovic.cruiser.objects.car.engine;

public class Crankshaft {
    private String codeName;
    private int maxTorque;
    private float damage;
    private String engineCodeName;

    public Crankshaft(String codeName, int maxTorque, float damage, String engineCodeName) {
        this.codeName = codeName;
        this.maxTorque = maxTorque;
        this.damage = damage;
        this.engineCodeName = engineCodeName;
    }

    public String getCodeName() {
        return codeName;
    }

    public int getMaxTorque() {
        return maxTorque;
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
