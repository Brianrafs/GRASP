package model;

public class Car extends Vehicle{
    private double autonomy;
    private String engine;
    private String licensePlate;

    public Car(double autonomy, String engine, String licensePlate) {
        super();
        this.autonomy = autonomy;
        this.engine = engine;
        this.licensePlate = licensePlate;
    }

    public double getAutonomy() {
        return autonomy;
    }

    public void setAutonomy(double autonomy) {
        this.autonomy = autonomy;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
      //  this.engine = engine;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        //this.licensePlate = licensePlate;
    }
}
