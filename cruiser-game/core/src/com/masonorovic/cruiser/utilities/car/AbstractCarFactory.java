package com.masonorovic.cruiser.utilities.car;

import java.util.List;

public abstract class AbstractCarFactory {

    protected CarFileSection findCarFileSectionByPartCode(List<CarFileSection> carFileSections, String part) {
        for (CarFileSection carFileSection : carFileSections) {
            if (carFileSection.getPartCode().equals(part)) return carFileSection;
        }

        return null;
    }

    protected String[] findPartByCodeName(List<String[]> parts, String codeName) {
        if (codeName.equals("NONE")) return null;

        for (String[] part : parts) {
            if (part[0].equals(codeName)) return part;
        }

        return null;
    }

    protected int[] parseIntArray(String rawIntArray) {
        String[] points = rawIntArray.split("-");
        int[] values = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            values[i] = Integer.parseInt(points[i]);
        }
        return values;
    }

    protected float[] parseFloatArray(String rawFloatArray) {
        String[] points = rawFloatArray.split("-");
        float[] values = new float[points.length];
        for (int i = 0; i < points.length; i++) {
            values[i] = Float.parseFloat(points[i]);
        }
        return values;
    }
}
