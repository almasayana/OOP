package delivery.app;

import delivery.model.*;
import delivery.service.DeliveryService;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Engine v8 = new Engine("V8 Gas", 450.0);
        Engine diesel = new Engine("Inline-6 Diesel", 350.0);
        Car sedan = new Car("BMW M5", 1000.0, v8, 5);
        Truck heavyTruck = new Truck("Volvo FH16", 5000.0, diesel, 20000);

        List<Vehicle> fleet = new ArrayList<>();
        fleet.add(sedan);
        fleet.add(heavyTruck);

        DeliveryService service = new DeliveryService();

        System.out.println("--- All Vehicles ---");
        service.printAllVehicles(fleet);

        System.out.println("\n--- Delivery Costs ---");
        service.calculateAllDeliveries(fleet);

        System.out.println("\nTotal Fleet Delivery Cost: $" + service.calculateTotalCost(fleet));
        
        System.out.println("\nCar with extra weight: $" + sedan.calculateDeliveryCost(15.5));
    }
}