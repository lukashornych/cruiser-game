package com.masonorovic.cruiser.objects.car.drivetrain;

public class Transmission {
    private String codeName;
    private TransmissionType transmissionType;
    private float efficiency;
    private float[] gearRatios;
    private float damage;

    public Transmission(String codeName,
                        TransmissionType transmissionType,
                        float efficiency,
                        float[] gearRatios,
                        float damage) {
        this.codeName = codeName;
        this.transmissionType = transmissionType;
        this.efficiency = efficiency;
        this.gearRatios = gearRatios;
        this.damage = damage;
    }

    public String getCodeName() {
        return codeName;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public float getEfficiency() {
        return efficiency;
    }

    public float[] getGearRatios() {
        return gearRatios;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }
}
