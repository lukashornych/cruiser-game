package com.masonorovic.cruiser.objects.car.drivetrain;

public class Differential {
    private String codeName;
    private float finalDriveRatio;

    public Differential(String codeName, float finalDriveRatio) {
        this.codeName = codeName;
        this.finalDriveRatio = finalDriveRatio;
    }

    public String getCodeName() {
        return codeName;
    }

    public float getFinalDriveRatio() {
        return finalDriveRatio;
    }
}
