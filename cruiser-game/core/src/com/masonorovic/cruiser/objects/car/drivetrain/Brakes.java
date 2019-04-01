package com.masonorovic.cruiser.objects.car.drivetrain;

public class Brakes {
    private String codeName;
    private int maxBrakeForce;
    private float damage;

    public Brakes(String codeName, int maxBrakeForce, float damage) {
        this.codeName = codeName;
        this.maxBrakeForce = maxBrakeForce;
        this.damage = damage;
    }

    public String getCodeName() {
        return codeName;
    }

    public int getMaxBrakeForce() {
        return maxBrakeForce;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }
}
