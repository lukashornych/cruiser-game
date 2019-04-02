package com.masonorovic.cruiser.objects.car.body;

import com.badlogic.gdx.graphics.Color;

public class Body {
    private final float frontalArea = 2.2f;

    private String carCodeName;
    private Color color;
    private float dragCoefficient;
    private float cog;
    private float length;
    private float width;
    private float height;
    private float wheelbase;
    private float frontTrack;
    private float rearTrack;
    private int weight;

    public Body(String carCodeName,
                Color color,
                float dragCoefficient,
                float cog,
                float length,
                float width,
                float height,
                float wheelbase,
                float frontTrack,
                float rearTrack,
                int weight) {
        this.carCodeName = carCodeName;
        this.color = color;
        this.dragCoefficient = dragCoefficient;
        this.cog = cog;
        this.length = length;
        this.width = width;
        this.height = height;
        this.wheelbase = wheelbase;
        this.frontTrack = frontTrack;
        this.rearTrack = rearTrack;
        this.weight = weight;
    }

    public String getCarCodeName() {
        return carCodeName;
    }

    public float getFrontalArea() {
        return frontalArea;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getDragCoefficient() {
        return dragCoefficient;
    }

    public float getCog() {
        return cog;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getWheelbase() {
        return wheelbase;
    }

    public float getFrontTrack() {
        return frontTrack;
    }

    public float getRearTrack() {
        return rearTrack;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }
}
