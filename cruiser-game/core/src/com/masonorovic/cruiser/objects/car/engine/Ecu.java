package com.masonorovic.cruiser.objects.car.engine;

public class Ecu {
    private String codeName;
    private int boostPressure;
    private int idleRpm;
    private boolean canProtectFromOverheat;
    private RevLimiter revLimiter;
    private EngineOverheatProtection engineOverheatProtection;
    private ForcedInductionSystemOverheatProtection forcedInductionSystemOverheatProtection;

    public Ecu(String codeName,
               int boostPressure,
               int idleRpm,
               boolean canProtectFromOverheat,
               RevLimiter revLimiter,
               EngineOverheatProtection engineOverheatProtection,
               ForcedInductionSystemOverheatProtection forcedInductionSystemOverheatProtection) {
        this.codeName = codeName;
        this.boostPressure = boostPressure;
        this.idleRpm = idleRpm;
        this.canProtectFromOverheat = canProtectFromOverheat;
        this.revLimiter = revLimiter;
        this.engineOverheatProtection = engineOverheatProtection;
        this.forcedInductionSystemOverheatProtection = forcedInductionSystemOverheatProtection;
    }

    public String getCodeName() {
        return codeName;
    }

    public int getBoostPressure() {
        return boostPressure;
    }

    public void setBoostPressure(int boostPressure) {
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

    public boolean isCanProtectFromOverheat() {
        return canProtectFromOverheat;
    }
}
