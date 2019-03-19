package com.masonorovic.cruiser.objects.car.engine;

public class RevLimiter {
    private int maxRpm;
    private boolean launchControlOn;
    private int launchControlRpm;

    public RevLimiter(int maxRpm, boolean launchControlOn, int launchControlRpm) {
        this.maxRpm = maxRpm;
        this.launchControlOn = launchControlOn;
        this.launchControlRpm = launchControlRpm;
    }

    public int getMaxRpm() {
        return maxRpm;
    }

    public boolean isLaunchControlOn() {
        return launchControlOn;
    }

    public int getLaunchControlRpm() {
        return launchControlRpm;
    }
}
