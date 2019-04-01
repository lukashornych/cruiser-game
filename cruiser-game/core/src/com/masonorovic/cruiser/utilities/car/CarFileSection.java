package com.masonorovic.cruiser.utilities.car;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;

public class CarFileSection {
    private String partCode;
    private HashMap<String, String> values;

    public CarFileSection(String partCode) {
        this.partCode = partCode;
        values = new HashMap<>();
    }

    public String getPartCode() {
        return partCode;
    }

    public HashMap<String, String> getValues() {
        return values;
    }

    public void setValues(HashMap<String, String> values) {
        this.values = values;
    }

    public String getValueAsString(String key) {
        return values.get(key);
    }

    public int getValueAsInt(String key) {
        return Integer.parseInt(values.get(key));
    }

    public float getValueAsFloat(String key) {
        return Float.parseFloat(values.get(key));
    }

    public boolean getValueAsBoolean(String key) {
        return Boolean.parseBoolean(values.get(key));
    }
}
