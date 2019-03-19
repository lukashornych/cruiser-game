package com.masonorovic.cruiser.objects.car.engine;

public class Ecu {
    private String codeName;
    private float boostPressure;
    private int idleRpm;
    private RevLimiter revLimiter;
    private EngineOverheatProtection engineOverheatProtection;
    private ForcedInductionSystemOverheatProtection forcedInductionSystemOverheatProtection;

    public Ecu(String codeName,
               float boostPressure,
               int idleRpm,
               RevLimiter revLimiter,
               EngineOverheatProtection engineOverheatProtection,
               ForcedInductionSystemOverheatProtection forcedInductionSystemOverheatProtection) {
        this.codeName = codeName;
        this.boostPressure = boostPressure;
        this.idleRpm = idleRpm;
        this.revLimiter = revLimiter;
        this.engineOverheatProtection = engineOverheatProtection;
        this.forcedInductionSystemOverheatProtection = forcedInductionSystemOverheatProtection;
    }

    public String getCodeName() {
        return codeName;
    }

    public float getBoostPressure() {
        return boostPressure;
    }

    public void setBoostPressure(float boostPressure) {
        this.boostPressure = boostPressure;
    }

    public int getIdleRpm() {
        return idleRpm;
    }

    public void setIdleRpm(int idleRpm) {
        this.idleRpm = idleRpm;
    }

    public RevLimiter getRevLimiter() {
        return revLimiter;
    }

    public EngineOverheatProtection getEngineOverheatProtection() {
        return engineOverheatProtection;
    }

    public ForcedInductionSystemOverheatProtection getForcedInductionSystemOverheatProtection() {
        return forcedInductionSystemOverheatProtection;
    }
}
