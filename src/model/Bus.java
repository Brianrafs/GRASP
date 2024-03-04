package src.model;

public class Bus extends Vehicle {
    private int passengerCount;

    public Bus(double purchaseValue, int passengerCount) throws Exception {
        super(purchaseValue);
        this.passengerCount = passengerCount;
    }

    @Override
    public double calculateDailyPrice() {
        return 0.04 * getPurchaseValue() + 100 * passengerCount;
    }
}
