package com.masonorovic.cruiser.objects.car.engine;

public abstract class ForcedInductionSystem {
    protected String codeName;
    protected int maxBoostPressure;
    protected float[] torqueCurve;
    protected float damage;

    protected ForcedInductionSystem(String codeName,
                                    int maxBoostPressure,
                                    float[] torqueCurve,
                                    float damage) {
        this.codeName = codeName;
        this.maxBoostPressure = maxBoostPressure;
        this.torqueCurve = torqueCurve;
        this.damage = damage;
    }

    public String getCodeName() {
        return codeName;
    }

    public int getMaxBoostPressure() {
        return maxBoostPressure;
    }

    public float[] getTorqueCurve() {
        return torqueCurve;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }
}
