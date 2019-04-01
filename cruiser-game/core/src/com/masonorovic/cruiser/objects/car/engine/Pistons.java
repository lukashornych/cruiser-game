package com.masonorovic.cruiser.objects.car.engine;

public class Pistons {
    private String codeName;
    private int maxTorque;
    private float damage;
    private int weightReduction;
    private String engineCodeName;

    public Pistons(String codeName, int maxTorque, float damage, int weightReduction, String engineCodeName) {
        this.codeName = codeName;
        this.maxTorque = maxTorque;
        this.damage = damage;
        this.weightReduction = weightReduction;
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

    public int getWeightReduction() {
        return weightReduction;
    }

    public String getEngineCodeName() {
        return engineCodeName;
    }
}
