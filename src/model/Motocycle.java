package src.model;

public class Motocycle extends Vehicle {
    private String engine;
    private String starterSystem;

    public Motocycle(double purchaseValue, String engine, String starterSystem) throws Exception {
        super(purchaseValue);
        this.engine = engine;
        this.starterSystem = starterSystem;
    }

    @Override
    public double calculateDailyPrice() {
        double dailyPrice = 0.02 * getPurchaseValue();
        if (starterSystem.equalsIgnoreCase("elétrico")) {
            dailyPrice += 20.00;
        } else if (starterSystem.equalsIgnoreCase("manual")) {
            dailyPrice += 5.00;
        }
        return dailyPrice;
    }
}
