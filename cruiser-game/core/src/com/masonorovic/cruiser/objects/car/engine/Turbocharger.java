package com.masonorovic.cruiser.objects.car.engine;

public class Turbocharger extends ForcedInductionSystem {
    private Intercooler intercooler;

    public Turbocharger(String codeName,
                        int maxBoostPressure,
                        float[] torqueCurve,
                        float damage,
                        Intercooler intercooler) {
        super(codeName, maxBoostPressure, torqueCurve, damage);
        this.intercooler = intercooler;
    }

    public Intercooler getIntercooler() {
        return intercooler;
    }

    public void setIntercooler(Intercooler intercooler) {
        this.intercooler = intercooler;
    }
}
