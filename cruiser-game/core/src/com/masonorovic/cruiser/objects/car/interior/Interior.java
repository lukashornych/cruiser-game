package com.masonorovic.cruiser.objects.car.interior;

public class Interior {
    private String carCodeName;
    private boolean strippedRearSeats;
    private boolean strippedPassengerSeat;

    private HeadUnit headUnit;
    private Speakers speakers;

    public Interior(String carCodeName,
                    boolean strippedRearSeats,
                    boolean strippedPassengerSeat,
                    HeadUnit headUnit,
                    Speakers speakers) {
        this.carCodeName = carCodeName;
        this.strippedRearSeats = strippedRearSeats;
        this.strippedPassengerSeat = strippedPassengerSeat;
        this.headUnit = headUnit;
        this.speakers = speakers;
    }

    public String getCarCodeName() {
        return carCodeName;
    }

    public HeadUnit getHeadUnit() {
        return headUnit;
    }

    public void setHeadUnit(HeadUnit headUnit) {
        this.headUnit = headUnit;
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public boolean isStrippedRearSeats() {
        return strippedRearSeats;
    }

    public void setStrippedRearSeats(boolean strippedRearSeats) {
        this.strippedRearSeats = strippedRearSeats;
    }

    public boolean isStrippedPassengerSeat() {
        return strippedPassengerSeat;
    }

    public void setStrippedPassengerSeat(boolean strippedPassengerSeat) {
        this.strippedPassengerSeat = strippedPassengerSeat;
    }
}
