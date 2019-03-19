package com.masonorovic.cruiser.objects.car.engine;

public class FuelTank {
    private String codeName;
    private int capacity;
    private float fuelLevel;

    public FuelTank(String codeName, int capacity, float fuelLevel) {
        this.codeName = codeName;
        this.capacity = capacity;
        this.fuelLevel = fuelLevel;
    }

    public String getCodeName() {
        return codeName;
    }

    public int getCapacity() {
        return capacity;
    }

    public float getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(float fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
