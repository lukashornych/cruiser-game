package com.masonorovic.cruiser.objects.car.engine;

public class Supercharger extends ForcedInductionSystem {
    public Supercharger(String codeName,
                        int maxBoostPressure,
                        float[] torqueCurve,
                        float damage) {
        super(codeName, maxBoostPressure, torqueCurve, damage);
    }
}
