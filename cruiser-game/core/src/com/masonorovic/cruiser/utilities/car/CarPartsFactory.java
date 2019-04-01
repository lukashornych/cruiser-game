package com.masonorovic.cruiser.utilities.car;

import com.masonorovic.cruiser.objects.car.drivetrain.*;
import com.masonorovic.cruiser.objects.car.engine.*;

public class CarPartsFactory extends AbstractCarFactory {
    private CarDataLoader cdl;

    public CarPartsFactory(CarDataLoader cdl) {
        this.cdl = cdl;
    }

    public AirFilter createAirfilter(String codeName) {
        String[] part = findPartByCodeName(cdl.getAirfiltersData(), codeName);
        if (part == null) return null;

        return new AirFilter(codeName, Float.parseFloat(part[3]));
    }

    public Camshaft createCamshaft(String codeName) {
        String[] part = findPartByCodeName(cdl.getCamshaftsData(), codeName);
        if (part == null) return null;

        return new Camshaft(codeName, Float.parseFloat(part[3]), part[4]);
    }

    public Crankshaft createCrankshaft(String codeName, float damage) {
        String[] part = findPartByCodeName(cdl.getCrankshaftsData(), codeName);
        if (part == null) return null;

        return new Crankshaft(codeName, Integer.parseInt(part[3]), damage, part[4]);
    }

    public Ecu createEcu(String codeName, int boostPressure, int idleRpm, int maxRpm, int launchControlRpm, boolean launchControlOn, int eop, int fisop) {
        String[] part = findPartByCodeName(cdl.getEcusData(), codeName);

        return new Ecu(codeName,
                boostPressure,
                idleRpm,
                Boolean.parseBoolean(part[6]),
                new RevLimiter(maxRpm, launchControlOn, launchControlRpm, Boolean.parseBoolean(part[5])),
                new EngineOverheatProtection(eop > 0, eop),
                new ForcedInductionSystemOverheatProtection(fisop > 0, fisop));
    }

    public Exhaust createExhaust(String codeName) {
        String[] part = findPartByCodeName(cdl.getExhaustsData(), codeName);
        if (part == null) return null;

        return new Exhaust(codeName, Float.parseFloat(part[3]));
    }

    public FuelPump createFuelPump(String codeName) {
        String[] part = findPartByCodeName(cdl.getFuelPumpsData(), codeName);
        if (part == null) return null;

        return new FuelPump(codeName, Integer.parseInt(part[3]), Integer.parseInt(part[4]));
    }

    public FuelTank createFuelTank(String codeName, float fuelLevel) {
        String[] part = findPartByCodeName(cdl.getFueltanksData(), codeName);
        if (part == null) return null;

        return new FuelTank(codeName, Integer.parseInt(part[3]), fuelLevel);
    }

    public IntakeManifold createIntakeManifold(String codeName) {
        String[] part = findPartByCodeName(cdl.getIntakemanifoldsData(), codeName);
        if (part == null) return null;

        return new IntakeManifold(codeName, Float.parseFloat(part[3]));
    }

    public Pistons createPistons(String codeName, float damage) {
        String[] part = findPartByCodeName(cdl.getPistonsData(), codeName);
        if (part == null) return null;

        return new Pistons(codeName, Integer.parseInt(part[3]), damage, Integer.parseInt(part[4]), part[5]);
    }

    public Radiator createRadiator(String codeName) {
        String[] part = findPartByCodeName(cdl.getRadiatorsData(), codeName);
        if (part == null) return null;

        return new Radiator(codeName, Integer.parseInt(part[3]));
    }

    public Supercharger createSupercharger(String codeName, float damage) {
        String[] part = findPartByCodeName(cdl.getSuperchargersData(), codeName);
        if (part == null) return null;

        return new Supercharger(codeName, Integer.parseInt(part[3]), parseFloatArray(part[4]), damage);
    }

    public Turbocharger createTurbocharger(String codeName, float damage, String intercoolerCodeName) {
        String[] turbocharger = findPartByCodeName(cdl.getTurbochargersData(), codeName);
        String[] intercooler = findPartByCodeName(cdl.getIntercoolersData(), intercoolerCodeName);
        if (turbocharger == null) return null;

        return new Turbocharger(codeName,
                Integer.parseInt(turbocharger[3]),
                parseFloatArray(turbocharger[4]),
                damage,
                (intercooler == null) ?
                        null : new Intercooler(intercoolerCodeName, Integer.parseInt(intercooler[3])));
    }

    public Valves createValves(String codeName, float damage) {
        String[] part = findPartByCodeName(cdl.getValvesData(), codeName);
        if (part == null) return null;

        return new Valves(codeName, Integer.parseInt(part[3]), damage, part[4]);
    }

    public Transmission createTransmission(String codeName, float damage) {
        String[] part = findPartByCodeName(cdl.getTransmissionsData(), codeName);
        if (part == null) return null;

        return new Transmission(codeName,
                TransmissionType.valueOf(part[3]),
                Float.parseFloat(part[4]),
                parseFloatArray(part[5]),
                damage);
    }

    public Tires createTires(String codeName, float damage) {
        String[] part = findPartByCodeName(cdl.getTiresData(), codeName);
        if (part == null) return null;

        return new Tires(codeName,
                Float.parseFloat(part[3]),
                Float.parseFloat(part[4]),
                Float.parseFloat(part[5]),
                damage);
    }

    public Differential createDifferential(String codeName) {
        String[] part = findPartByCodeName(cdl.getDifferentialsData(), codeName);
        if (part == null) return null;

        return new Differential(codeName, Float.parseFloat(part[3]));
    }

    public Brakes createBrakes(String codeName, float damage) {
        String[] part = findPartByCodeName(cdl.getBrakesData(), codeName);
        if (part == null) return null;

        return new Brakes(codeName, Integer.parseInt(part[3]), damage);
    }
}
