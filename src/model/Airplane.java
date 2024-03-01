package model;

public class Airplane extends Vehicle {
    private double airTime;
    private double cruisingSpeed;

    public double getAirTime() {
        return airTime;
    }

    public void setAirTime(double airTime) {
        this.airTime = airTime;
    }

    public double getCruisingSpeed() {
        return cruisingSpeed;
    }

    public void setCruisingSpeed(double cruisingSpeed) {
        this.cruisingSpeed = cruisingSpeed;
    }

    public Airplane(double airTime, double cruisingSpeed){
        super();
        this.airTime = airTime;
        this.cruisingSpeed = cruisingSpeed;
    }
}
