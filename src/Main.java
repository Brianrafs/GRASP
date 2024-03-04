package src;

import src.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Criando alguns veículos
            List<Vehicle> vehicles = new ArrayList<>();

            // Adicionando 5 carros diferentes
            vehicles.add(new Car(20000, 600, "Motor1", "ABC1234"));
            vehicles.add(new Car(25000, 700, "Motor2", "DEF5678"));
            vehicles.add(new Car(18000, 500, "Motor3", "GHI9101"));
            vehicles.add(new Car(22000, 550, "Motor4", "JKL2345"));
            vehicles.add(new Car(23000, 650, "Motor5", "MNO6789"));

            // Adicionando 5 helicópteros diferentes
            vehicles.add(new Helicopter(500000, 4));
            vehicles.add(new Helicopter(550000, 6));
            vehicles.add(new Helicopter(480000, 5));
            vehicles.add(new Helicopter(520000, 3));
            vehicles.add(new Helicopter(530000, 7));

            // Adicionando 5 motocicletas diferentes
            vehicles.add(new Motocycle(10000, "Motor6", "elétrico"));
            vehicles.add(new Motocycle(11000, "Motor7", "manual"));
            vehicles.add(new Motocycle(9000, "Motor8", "elétrico"));
            vehicles.add(new Motocycle(12000, "Motor9", "manual"));
            vehicles.add(new Motocycle(9500, "Motor10", "elétrico"));

            // Adicionando 5 ônibus diferentes
            vehicles.add(new Bus(80000, 50));
            vehicles.add(new Bus(85000, 55));
            vehicles.add(new Bus(78000, 48));
            vehicles.add(new Bus(82000, 52));
            vehicles.add(new Bus(83000, 53));

            // Adicionando 5 aviões diferentes
            vehicles.add(new Airplane(1000000, 10, 500));
            vehicles.add(new Airplane(1100000, 12, 550));
            vehicles.add(new Airplane(950000, 8, 480));
            vehicles.add(new Airplane(1050000, 11, 520));
            vehicles.add(new Airplane(1070000, 13, 530));

            // Calculando e exibindo o valor da diária de cada veículo
            for (Vehicle v : vehicles) {
                System.out.println("\nValor da diária do veiculo: \n" + v.getType() +" "+ v.getId() + ": " + v.calculateDailyPrice());
            }

            // Exibindo a quantidade de veículos cadastrados
            System.out.println("\nQuantidade de veículos cadastrados: " + vehicles.size());

            // Valor da diária de um determinado veículo
            Vehicle firstVehicle = vehicles.get(0);
            System.out.println("\nValor da diária do"+ " " + firstVehicle.getType() +" "+ firstVehicle.findVehicleDailyPrice(vehicles, firstVehicle.getId()));


            // Veículos cadastrados de determinado tipo, em ordem alfabética da identificação
            List<Vehicle> sortedCars = vehicles.get(0).filterVehiclesByType(vehicles, Car.class);
            System.out.println("\nCarros cadastrados (em ordem alfabética):\n ");
            for (Vehicle v : sortedCars) {
                System.out.println("ID: " + v.getId());
            }

            //Veículo com diária mais cara
            Vehicle mostExpensiveVehicle = vehicles.get(0).findMostExpensiveVehicle(vehicles);
            System.out.println("\nVeículo com a diária mais cara: "+ mostExpensiveVehicle.getType()+ " " + mostExpensiveVehicle.getId());

        } catch (Exception e) {
            System.out.println("Erro ao criar veículo: " + e.getMessage());
        }
    }
}