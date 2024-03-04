package src.model;

public class Car extends Vehicle {
    private double autonomy;
    private String engine;
    private String licensePlate;

    public Car(double purchaseValue, double autonomy, String engine, String licensePlate) throws Exception {
        super(purchaseValue);
        this.autonomy = autonomy;
        this.engine = engine;
        this.licensePlate = licensePlate;
    }

    @Override
    public double calculateDailyPrice() {
        return 0.02 * getPurchaseValue();
    }
}
