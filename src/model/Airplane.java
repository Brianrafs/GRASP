package src.model;

public class Airplane extends Vehicle {
    private double airTime;
    private double cruisingSpeed;

    public Airplane(double purchaseValue, double airTime, double cruisingSpeed) throws Exception {
        super(purchaseValue);
        this.airTime = airTime;
        this.cruisingSpeed = cruisingSpeed;
    }

    @Override
    public double calculateDailyPrice() {
        return 0.20 * getPurchaseValue() + 1000 * cruisingSpeed;
    }
}