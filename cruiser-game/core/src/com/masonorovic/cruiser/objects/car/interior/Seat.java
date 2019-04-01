package com.masonorovic.cruiser.objects.car.interior;

public class Seat {
    private String codeName;
    private int weightReduction;

    public Seat(String codeName, int weightReduction) {
        this.codeName = codeName;
        this.weightReduction = weightReduction;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public int getWeightReduction() {
        return weightReduction;
    }

    public void setWeightReduction(int weightReduction) {
        this.weightReduction = weightReduction;
    }
}
