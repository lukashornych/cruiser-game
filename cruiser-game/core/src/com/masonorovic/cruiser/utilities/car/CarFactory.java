package com.masonorovic.cruiser.utilities.car;

import com.masonorovic.cruiser.objects.car.Car;
import com.masonorovic.cruiser.objects.car.body.Body;
import com.masonorovic.cruiser.objects.car.drivetrain.*;
import com.masonorovic.cruiser.objects.car.engine.*;
import com.masonorovic.cruiser.objects.car.interior.HeadUnit;
import com.masonorovic.cruiser.objects.car.interior.Interior;
import com.masonorovic.cruiser.objects.car.interior.Seat;
import com.masonorovic.cruiser.objects.car.interior.Speakers;

import java.util.List;

public class CarFactory extends AbstractCarFactory {
    private CarDataLoader cdl;
    private CarPartsFactory cpf;

    public CarFactory(CarDataLoader cdl) {
        this.cdl = cdl;
        cpf = new CarPartsFactory(cdl);
    }

    public Car createCar(List<CarFileSection> carFileSections) {
        String codeName = findCarFileSectionByPartCode(carFileSections, "car").getValueAsString("cn");
        Engine engine = createEngine(carFileSections);
        Drivetrain drivetrain = createDrivetrain(carFileSections);
        Body body = createBody(carFileSections);
        Interior interior = createInterior(carFileSections);

        return new Car(codeName, engine, drivetrain, body, interior);
    }

    public Engine createEngine(List<CarFileSection> carFileSections) {
        String engineCodeName = findCarFileSectionByPartCode(carFileSections, "engine").getValueAsString("cn");
        String[] engine = findPartByCodeName(cdl.getEnginesData(), engineCodeName);
        if (engine == null) return null;

        CarFileSection pistonsSection = findCarFileSectionByPartCode(carFileSections, "pistons");
        CarFileSection crankshaftSection = findCarFileSectionByPartCode(carFileSections, "crankshaft");
        CarFileSection camshaftSection = findCarFileSectionByPartCode(carFileSections, "camshaft");
        CarFileSection intakeManifoldSection = findCarFileSectionByPartCode(carFileSections, "intakemanifold");
        CarFileSection airfilterSection = findCarFileSectionByPartCode(carFileSections, "airfilter");
        CarFileSection exhaustSection = findCarFileSectionByPartCode(carFileSections, "exhaust");
        CarFileSection radiatorSection = findCarFileSectionByPartCode(carFileSections, "radiator");
        CarFileSection valvesSection = findCarFileSectionByPartCode(carFileSections, "valves");
        CarFileSection fuelPumpSection = findCarFileSectionByPartCode(carFileSections, "fuelpump");
        CarFileSection fuelTankSection = findCarFileSectionByPartCode(carFileSections, "fueltank");
        CarFileSection ecuSection = findCarFileSectionByPartCode(carFileSections, "ecu");
        CarFileSection fisSection = findCarFileSectionByPartCode(carFileSections, "fis");
        CarFileSection intercoolerSection = findCarFileSectionByPartCode(carFileSections, "intercooler");

        int fisType = 0; // 0 = none; 1 = turbocharger; 2 = supercharger
        if (findPartByCodeName(cdl.getTurbochargersData(), fisSection.getValueAsString("cn")) != null) fisType = 1;
        if (findPartByCodeName(cdl.getSuperchargersData(), fisSection.getValueAsString("cn")) != null) fisType = 2;

        return new Engine(engineCodeName,
                        parseIntArray(engine[5]),
                        cpf.createPistons(pistonsSection.getValueAsString("cn"), pistonsSection.getValueAsFloat("damage")),
                        cpf.createCrankshaft(crankshaftSection.getValueAsString("cn"), crankshaftSection.getValueAsFloat("damage")),
                        cpf.createCamshaft(camshaftSection.getValueAsString("cn")),
                        cpf.createIntakeManifold(intakeManifoldSection.getValueAsString("cn")),
                        cpf.createAirfilter(airfilterSection.getValueAsString("cn")),
                        cpf.createExhaust(exhaustSection.getValueAsString("cn")),
                        cpf.createRadiator(radiatorSection.getValueAsString("cn")),
                        cpf.createValves(valvesSection.getValueAsString("cn"), valvesSection.getValueAsFloat("damage")),
                        cpf.createFuelPump(fuelPumpSection.getValueAsString("cn")),
                        cpf.createFuelTank(fuelTankSection.getValueAsString("cn"), fuelTankSection.getValueAsFloat("fuellevel")),
                        cpf.createEcu(ecuSection.getValueAsString("cn"),
                                ecuSection.getValueAsInt("bp"),
                                ecuSection.getValueAsInt("idlerpm"),
                                ecuSection.getValueAsInt("maxrpm"),
                                ecuSection.getValueAsInt("launchrpm"),
                                ecuSection.getValueAsBoolean("lco"),
                                ecuSection.getValueAsInt("eop"),
                                ecuSection.getValueAsInt("fisop")),
                        (fisType == 0) ? null : (fisType == 1) ?
                            cpf.createTurbocharger(fisSection.getValueAsString("cn"),
                                                fisSection.getValueAsFloat("damage"),
                                                intercoolerSection.getValueAsString("cn")) :
                            cpf.createSupercharger(fisSection.getValueAsString("cn"),
                                                fisSection.getValueAsFloat("damage")));
    }

    private Interior createInterior(List<CarFileSection> carFileSections) {
        String carCodeName = findCarFileSectionByPartCode(carFileSections, "car").getValueAsString("cn");

        CarFileSection interiorSection = findCarFileSectionByPartCode(carFileSections, "interior");
        String huCodeName = interiorSection.getValueAsString("hu");
        String speakersCodeName = interiorSection.getValueAsString("speakers");
        String seatCodeName = interiorSection.getValueAsString("seat");
        String[] seat = findPartByCodeName(cdl.getSeatsData(), seatCodeName);

        return new Interior(carCodeName,
                interiorSection.getValueAsBoolean("srs"),
                interiorSection.getValueAsBoolean("sps"),
                (huCodeName.equals("NONE")) ?
                        null : new HeadUnit(huCodeName),
                (speakersCodeName.equals("NONE")) ?
                        null : new Speakers(speakersCodeName),
                (seatCodeName.equals("NONE")) ?
                        null : new Seat(seatCodeName, Integer.parseInt(seat[3])));
    }

    private Drivetrain createDrivetrain(List<CarFileSection> carFileSections) {
        String[] drivetrainData = findPartByCodeName(cdl.getDrivetrainsData(),
                findCarFileSectionByPartCode(carFileSections, "car").getValueAsString("cn"));
        CarFileSection transmissionSection = findCarFileSectionByPartCode(carFileSections, "transmission");
        CarFileSection tiresSection = findCarFileSectionByPartCode(carFileSections, "tires");
        CarFileSection differentialSection = findCarFileSectionByPartCode(carFileSections, "differential");
        CarFileSection brakesSection = findCarFileSectionByPartCode(carFileSections, "brakes");

        return new Drivetrain(Float.parseFloat(drivetrainData[1]),
                cpf.createTransmission(transmissionSection.getValueAsString("cn"),
                        transmissionSection.getValueAsFloat("damage")),
                cpf.createTires(tiresSection.getValueAsString("cn"),
                        tiresSection.getValueAsFloat("damage")),
                cpf.createDifferential(differentialSection.getValueAsString("cn")),
                cpf.createBrakes(brakesSection.getValueAsString("cn"), brakesSection.getValueAsFloat("damage")));
    }

    private Body createBody(List<CarFileSection> carFileSections) {
        return new Body(findCarFileSectionByPartCode(carFileSections, "car").getValueAsString("cn"));
    }
}
