package com.masonorovic.cruiser.objects.car.engine;

public class Engine {
    private String codeName;
    private float displacement;
    private int[] baseTorqueCurve;

    private Pistons pistons;
    private Crankshaft crankshaft;
    private Camshaft camshaft;
    private IntakeManifold intakeManifold;
    private AirFilter airFilter;
    private Exhaust exhaust;
    private Radiator radiator;
    private Valves valves;
    private FuelPump fuelPump;
    private FuelTank fuelTank;
    private Ecu ecu;
    private ForcedInductionSystem forcedInductionSystem;

    public Engine(String codeName,
                  float displacement,
                  int[] baseTorqueCurve,
                  Pistons pistons,
                  Crankshaft crankshaft,
                  Camshaft camshaft,
                  IntakeManifold intakeManifold,
                  AirFilter airFilter,
                  Exhaust exhaust,
                  Radiator radiator,
                  Valves valves,
                  FuelPump fuelPump,
                  FuelTank fuelTank,
                  Ecu ecu,
                  ForcedInductionSystem forcedInductionSystem) {
        this.codeName = codeName;
        this.displacement = displacement;
        this.baseTorqueCurve = baseTorqueCurve;
        this.pistons = pistons;
        this.crankshaft = crankshaft;
        this.camshaft = camshaft;
        this.intakeManifold = intakeManifold;
        this.airFilter = airFilter;
        this.exhaust = exhaust;
        this.radiator = radiator;
        this.valves = valves;
        this.fuelPump = fuelPump;
        this.fuelTank = fuelTank;
        this.ecu = ecu;
        this.forcedInductionSystem = forcedInductionSystem;
    }

    public String getCodeName() {
        return codeName;
    }

    public float getDisplacement() {
        return displacement;
    }

    public int[] getBaseTorqueCurve() {
        return baseTorqueCurve;
    }

    public Pistons getPistons() {
        return pistons;
    }

    public void setPistons(Pistons pistons) {
        this.pistons = pistons;
    }

    public Crankshaft getCrankshaft() {
        return crankshaft;
    }

    public void setCrankshaft(Crankshaft crankshaft) {
        this.crankshaft = crankshaft;
    }

    public Camshaft getCamshaft() {
        return camshaft;
    }

    public void setCamshaft(Camshaft camshaft) {
        this.camshaft = camshaft;
    }

    public IntakeManifold getIntakeManifold() {
        return intakeManifold;
    }

    public void setIntakeManifold(IntakeManifold intakeManifold) {
        this.intakeManifold = intakeManifold;
    }

    public AirFilter getAirFilter() {
        return airFilter;
    }

    public void setAirFilter(AirFilter airFilter) {
        this.airFilter = airFilter;
    }

    public Exhaust getExhaust() {
        return exhaust;
    }

    public void setExhaust(Exhaust exhaust) {
        this.exhaust = exhaust;
    }

    public Radiator getRadiator() {
        return radiator;
    }

    public void setRadiator(Radiator radiator) {
        this.radiator = radiator;
    }

    public Valves getValves() {
        return valves;
    }

    public void setValves(Valves valves) {
        this.valves = valves;
    }

    public FuelPump getFuelPump() {
        return fuelPump;
    }

    public void setFuelPump(FuelPump fuelPump) {
        this.fuelPump = fuelPump;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public Ecu getEcu() {
        return ecu;
    }

    public void setEcu(Ecu ecu) {
        this.ecu = ecu;
    }

    public ForcedInductionSystem getForcedInductionSystem() {
        return forcedInductionSystem;
    }

    public void setForcedInductionSystem(ForcedInductionSystem forcedInductionSystem) {
        this.forcedInductionSystem = forcedInductionSystem;
    }
}
