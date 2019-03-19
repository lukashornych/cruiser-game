package com.masonorovic.cruiser.objects.car;

import com.masonorovic.cruiser.objects.car.body.Body;
import com.masonorovic.cruiser.objects.car.drivetrain.Drivetrain;
import com.masonorovic.cruiser.objects.car.engine.Engine;
import com.masonorovic.cruiser.objects.car.interior.Interior;

public class Car {
    private String codeName;

    private Engine engine;
    private Drivetrain drivetrain;
    private Body body;
    private Interior interior;

    public Car(String codeName, Engine engine, Drivetrain drivetrain, Body body, Interior interior) {
        this.codeName = codeName;
        this.engine = engine;
        this.drivetrain = drivetrain;
        this.body = body;
        this.interior = interior;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Drivetrain getDrivetrain() {
        return drivetrain;
    }

    public Body getBody() {
        return body;
    }

    public Interior getInterior() {
        return interior;
    }

    public String getCodeName() {
        return codeName;
    }
}
