package src.model;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class Vehicle {
    private String id;
    private double purchaseValue;
    private static Set<String> idSet = new HashSet<>();

    public Vehicle(double purchaseValue) throws Exception {
        this.id = generateID();
        this.purchaseValue = purchaseValue;
    }

    private String generateID() throws Exception {
        String generatedId;
        do {
            generatedId = UUID.randomUUID().toString().substring(0, 6);
        } while (idSet.contains(generatedId));

        idSet.add(generatedId);
        return generatedId;
    }

    public String getId() {
        return id;
    }

    public double getPurchaseValue() {
        return purchaseValue;
    }

    public void setPurchaseValue(double purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    public double calculateDailyPrice() {
        return 0.0;
    }

     public double findVehicleDailyPrice(List<Vehicle> vehicles, String vehicleId) {
        for (Vehicle v : vehicles) {
            if (v.getId().equals(vehicleId)) {
                return v.calculateDailyPrice();
            }
        }
        return -1.0;
    }

    public List<Vehicle> filterVehiclesByType(List<Vehicle> vehicles, Class<?> type) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (type.isInstance(v)) {
                filteredVehicles.add(v);
            }
        }
        Collections.sort(filteredVehicles, Comparator.comparing(Vehicle::getId));
        return filteredVehicles;
    }

    public Vehicle findMostExpensiveVehicle(List<Vehicle> vehicles) {
        Vehicle mostExpensive = null;
        double highestPrice = Double.MIN_VALUE;
        for (Vehicle v : vehicles) {
            double dailyPrice = v.calculateDailyPrice();
            if (dailyPrice > highestPrice) {
                highestPrice = dailyPrice;
                mostExpensive = v;
            }
        }
        return mostExpensive;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }
}
