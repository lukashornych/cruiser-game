package com.masonorovic.cruiser.objects.car.drivetrain;

public class Tires {
    private String codeName;
    private int diameter;
    private int width;
    private float tireFrictionCoefficient;
    private float damage;

    public Tires(String codeName,
                 int diameter,
                 int width,
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

    public int getDiameter() {
        return diameter;
    }

    public int getWidth() {
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
