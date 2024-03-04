package src.model;

public class Helicopter extends Vehicle {
    private int rotorCount;

    public Helicopter(double purchaseValue, int rotorCount) throws Exception {
        super(purchaseValue);
        this.rotorCount = rotorCount;
    }

    @Override
    public double calculateDailyPrice() {
        return 0.10 * getPurchaseValue() * rotorCount;
    }
}
