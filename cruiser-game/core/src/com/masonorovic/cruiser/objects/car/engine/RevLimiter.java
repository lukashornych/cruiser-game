package com.masonorovic.cruiser.objects.car.engine;

public class RevLimiter {
    private int maxRpm;
    private boolean launchControlOn;
    private int launchControlRpm;
    private boolean canLaunchControl;

    public RevLimiter(int maxRpm, boolean launchControlOn, int launchControlRpm, boolean canLaunchControl) {
        this.maxRpm = maxRpm;
        this.launchControlOn = launchControlOn;
        this.launchControlRpm = launchControlRpm;
        this.canLaunchControl = canLaunchControl;
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

    public boolean isCanLaunchControl() {
        return canLaunchControl;
    }
}
