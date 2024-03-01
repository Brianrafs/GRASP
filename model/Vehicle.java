package model;

public class Vehicle {
    private String id;
    private double purchaseValue;

    public Vehicle(String id, double purchaseValue) {
        this.id = id;
        this.purchaseValue = purchaseValue;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPurchaseValue() {
        return purchaseValue;
    }

    public void setPurchaseValue(double purchaseValue) {
        this.purchaseValue = purchaseValue;
    }
}
