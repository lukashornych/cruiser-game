package com.masonorovic.cruiser.utilities.car;

import com.badlogic.gdx.Gdx;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarDataLoader {
    private final String CARS_DATA = "cars_data.csv";
    private final String ENGINES_DATA = "engines_data.csv";
    private final String AIRFILTERS_DATA = "airfilters_data.csv";
    private final String CAMSHAFTS_DATA = "camshafts_data.csv";
    private final String CRANKSHAFTS_DATA = "crankshafts_data.csv";
    private final String ECUS_DATA = "ecus_data.csv";
    private final String EXHAUSTS_DATA = "exhausts_data.csv";
    private final String FUELPUMPS_DATA = "fuelpumps_data.csv";
    private final String FUELTANKS_DATA = "fueltanks_data.csv";
    private final String INTAKEMANIFOLDS_DATA = "intakemanifolds_data.csv";
    private final String INTERCOOLERS_DATA = "intercoolers_data.csv";
    private final String PISTONS_DATA = "pistons_data.csv";
    private final String RADIATORS_DATA = "radiators_data.csv";
    private final String SUPERCHARGERS_DATA = "superchargers_data.csv";
    private final String TURBOCHARGERS_DATA = "turbochargers_data.csv";
    private final String VALVES_DATA = "valves_data.csv";
    private final String DRIVETRAINS_DATA = "drivetrains_data.csv";
    private final String TRANSMISSIONS_DATA = "transmissions_data.csv";
    private final String TIRES_DATA = "tires_data.csv";
    private final String DIFFERENTIALS_DATA = "differentials_data.csv";
    private final String BODIES_DATA = "bodies_data.csv";
    private final String HUS_DATA = "hus_data.csv";
    private final String SPEAKERS_DATA = "speakers_data.csv";
    private final String SEATS_DATA = "seats_data.csv";
    private final String BRAKES_DATA = "brakes_data.csv";

    private List<String[]> carsData = null;
    private List<String[]> enginesData = null;
    private List<String[]> airfiltersData = null;
    private List<String[]> camshaftsData = null;
    private List<String[]> crankshaftsData = null;
    private List<String[]> ecusData = null;
    private List<String[]> exhaustsData = null;
    private List<String[]> fuelpumpsData = null;
    private List<String[]> fueltanksData = null;
    private List<String[]> intakemanifoldsData = null;
    private List<String[]> intercoolersData = null;
    private List<String[]> pistonsData = null;
    private List<String[]> radiatorsData = null;
    private List<String[]> superchargersData = null;
    private List<String[]> turbochargersData = null;
    private List<String[]> valvesData = null;
    private List<String[]> drivetrainsData = null;
    private List<String[]> transmissionsData = null;
    private List<String[]> tiresData = null;
    private List<String[]> differentialsData = null;
    private List<String[]> bodiesData = null;
    private List<String[]> husData = null;
    private List<String[]> speakersData = null;
    private List<String[]> seatsData = null;
    private List<String[]> brakesData = null;

    private List<String[]> loadCarPartsFile(String filepath) {
        List<String> lines;
        lines = new ArrayList<>(Arrays.asList(Gdx.files.internal(Paths.get(
                "cars_data",
                "parts_data",
                filepath).toString()).readString().split(System.getProperty("line.separator"))));

        List<String[]> parts = new ArrayList<>();
        for (String line : lines) {
            parts.add(line.split(";"));
        }
        return parts;
    }

    public List<String[]> getCarsData() {
        if (carsData == null) carsData = loadCarPartsFile(CARS_DATA);
        return carsData;
    }
    public List<String[]> getEnginesData() {
        if (enginesData == null) enginesData = loadCarPartsFile(ENGINES_DATA);
        return enginesData;
    }
    public List<String[]> getAirfiltersData() {
        if (airfiltersData == null) airfiltersData = loadCarPartsFile(AIRFILTERS_DATA);
        return airfiltersData;
    }
    public List<String[]> getCamshaftsData() {
        if (camshaftsData == null) camshaftsData = loadCarPartsFile(CAMSHAFTS_DATA);
        return camshaftsData;
    }
    public List<String[]> getExhaustsData() {
        if (exhaustsData == null) exhaustsData = loadCarPartsFile(EXHAUSTS_DATA);
        return exhaustsData;
    }
    public List<String[]> getFuelPumpsData() {
        if (fuelpumpsData == null) fuelpumpsData = loadCarPartsFile(FUELPUMPS_DATA);
        return fuelpumpsData;
    }
    public List<String[]> getRadiatorsData() {
        if (radiatorsData == null) radiatorsData = loadCarPartsFile(RADIATORS_DATA);
        return radiatorsData;
    }
    public List<String[]> getSuperchargersData() {
        if (superchargersData == null) superchargersData = loadCarPartsFile(SUPERCHARGERS_DATA);
        return superchargersData;
    }
    public List<String[]> getTurbochargersData() {
        if (turbochargersData == null) turbochargersData = loadCarPartsFile(TURBOCHARGERS_DATA);
        return turbochargersData;
    }
    public List<String[]> getHusData() {
        if (husData == null) husData = loadCarPartsFile(HUS_DATA);
        return husData;
    }
    public List<String[]> getSpeakersData() {
        if (speakersData == null) speakersData = loadCarPartsFile(SPEAKERS_DATA);
        return speakersData;
    }
    public List<String[]> getSeatsData() {
        if (seatsData == null) seatsData = loadCarPartsFile(SEATS_DATA);
        return seatsData;
    }

    public List<String[]> getCrankshaftsData() {
        if (crankshaftsData == null) crankshaftsData = loadCarPartsFile(CRANKSHAFTS_DATA);
        return crankshaftsData;
    }

    public List<String[]> getEcusData() {
        if (ecusData == null) ecusData = loadCarPartsFile(ECUS_DATA);
        return ecusData;
    }

    public List<String[]> getFueltanksData() {
        if (fueltanksData == null) fueltanksData = loadCarPartsFile(FUELTANKS_DATA);
        return fueltanksData;
    }

    public List<String[]> getIntakemanifoldsData() {
        if (intakemanifoldsData == null) intakemanifoldsData = loadCarPartsFile(INTAKEMANIFOLDS_DATA);
        return intakemanifoldsData;
    }

    public List<String[]> getIntercoolersData() {
        if (intercoolersData == null) intercoolersData = loadCarPartsFile(INTERCOOLERS_DATA);
        return intercoolersData;
    }

    public List<String[]> getPistonsData() {
        if (pistonsData == null) pistonsData = loadCarPartsFile(PISTONS_DATA);
        return pistonsData;
    }

    public List<String[]> getValvesData() {
        if (valvesData == null) valvesData = loadCarPartsFile(VALVES_DATA);
        return valvesData;
    }

    public List<String[]> getDrivetrainsData() {
        if (drivetrainsData == null) drivetrainsData = loadCarPartsFile(DRIVETRAINS_DATA);
        return drivetrainsData;
    }

    public List<String[]> getTransmissionsData() {
        if (transmissionsData == null) transmissionsData = loadCarPartsFile(TRANSMISSIONS_DATA);
        return transmissionsData;
    }

    public List<String[]> getTiresData() {
        if (tiresData == null) tiresData = loadCarPartsFile(TIRES_DATA);
        return tiresData;
    }

    public List<String[]> getDifferentialsData() {
        if (differentialsData == null) differentialsData = loadCarPartsFile(DIFFERENTIALS_DATA);
        return differentialsData;
    }

    public List<String[]> getBodiesData() {
        if (bodiesData == null) bodiesData = loadCarPartsFile(BODIES_DATA);
        return bodiesData;
    }

    public List<String[]> getBrakesData() {
        if (brakesData == null) brakesData = loadCarPartsFile(BRAKES_DATA);
        return brakesData;
    }
}
