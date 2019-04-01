package com.masonorovic.cruiser.objects.car.drivetrain;

public class Tires {
    private String codeName;
    private float diameter;
    private float width;
    private float tireFrictionCoefficient;
    private float damage;

    public Tires(String codeName,
                 float diameter,
                 float width,
                 float tireFrictionCoefficient,
                 float damage) {
        this.codeName = codeName;
        this.diameter = diameter;
        this.width = width;
        this.tireFrictionCoefficient = tireFrictionCoefficient;
        this.damage = damage;
    }

    public String getCodeName() {
        return codeName;
    }

    public float getDiameter() {
        return diameter;
    }

    public float getWidth() {
        return width;
    }

    public float getTireFrictionCoefficient() {
        return tireFrictionCoefficient;
    }

    public void setDamage(float damage) {
        this.damage = damage;
        // todo: add tire friction coefficient change dependent on damage
    }

    public float getDamage() {
        return damage;
    }
}
