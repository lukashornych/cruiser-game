package com.masonorovic.cruiser.utilities.car;

import com.badlogic.gdx.Gdx;
import com.masonorovic.cruiser.objects.car.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarLoader {

    public Car parseCarFile(String filepath) {
        List<String> lines = parseCarFileLines(filepath);
        List<CarFileSection> carFileSections = parseCarFileSection(lines);
        CarFactory carFactory = new CarFactory(new CarDataLoader());
        return carFactory.createCar(carFileSections);
    }

    private List<String> parseCarFileLines(String filepath) {
        List<String> lines = new ArrayList<>(Arrays.asList(Gdx.files.internal(filepath).readString().split(System.getProperty("line.separator"))));
        return lines;
    }

    private List<CarFileSection> parseCarFileSection(List<String> lines) {
        List<CarFileSection> carFileSections = new ArrayList<>();

        CarFileSection tempCarFileSection = null;
        for (String line : lines) {
            if (line.startsWith("#")) {
                if (tempCarFileSection != null) carFileSections.add(tempCarFileSection);
                tempCarFileSection = new CarFileSection(line.substring(1));
            } else {
                String[] valueLine = line.split(":");
                tempCarFileSection.getValues().put(valueLine[0], valueLine[1]);
            }
        }

        if (tempCarFileSection != null) carFileSections.add(tempCarFileSection);
        return carFileSections;
    }
}
