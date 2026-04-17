package com.pluralsight;

import java.util.Scanner;
public class VehicleApp {
    static Scanner scanner = new Scanner(System.in);
    static Vehicle[] vehicles = new Vehicle[20];
    static int vehicleCount = 0;

    public static void main(String[] args) {
        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
        boolean programIsRunning = true;
        while (programIsRunning) {
            System.out.print("""
                  What do you want to do?
                  
                  1 - List all vehicles
                  2 - Search by make/model
                  3 - Search by price range
                  4 - Search by color
                  5 - Add a vehicle
                  6 - Quit
                  Enter your command: """
            );

            int command = scanner.nextInt();
            scanner.nextLine();
            switch (command) {
                case 1 -> listOfVehicles();
                case 2 -> findVehiclesByMakeModel();
                case 3 -> findVehicleByPrice();
                case 4 -> findByColor();
                case 5 -> addVehicle();
                case 6 -> programIsRunning = false;
                default -> System.out.println("Invalid option...Please Try again!");
            }
        }


    }

    static void listOfVehicles() {
        int count = 0;


        for (Vehicle vehicle : vehicles) {
            if (vehicle != null){
            System.out.printf("VehicleID: %d, Make/Model: %s, Color: %s, Odometer: %d, Price: $%.2f%n",
                    vehicle.getVehicleId(),
                    vehicle.getMakeModel(),
                    vehicle.getColor(),
                    vehicle.getOdometerReading(),
                    vehicle.getPrice());
                    count++;}


        }
        System.out.printf("There are %d vehicles", count);

    }

    static void findVehiclesByMakeModel() {
        System.out.print("Enter make/model: ");
        String carType = scanner.nextLine();
        for (Vehicle vehicle : vehicles) {
            if(vehicle != null && vehicle.getMakeModel().toLowerCase().contains(carType)){
                System.out.printf("VehicleID: %d, Make/Model: %s, Color: %s, Odometer: %d, Price: $%.2f%n",
                        vehicle.getVehicleId(),
                        vehicle.getMakeModel(),
                        vehicle.getColor(),
                        vehicle.getOdometerReading(),
                        vehicle.getPrice());
            }

        }

    }

    static void findVehicleByPrice() {
        System.out.print("Enter lowest price range: ");
        float lowPrice = scanner.nextFloat();
        System.out.print("Enter highest price range: ");
        float highPrice = scanner.nextFloat();
        scanner.nextLine();
        for(Vehicle vehicle : vehicles){
            if(vehicle!=null){
            if(vehicle.getPrice() >= lowPrice && vehicle.getPrice()<= highPrice) {

                System.out.printf("VehicleID: %d, Make/Model: %s, Color: %s, Odometer: %d, Price: $%.2f%n",
                        vehicle.getVehicleId(),
                        vehicle.getMakeModel(),
                        vehicle.getColor(),
                        vehicle.getOdometerReading(),
                        vehicle.getPrice());}

            }
        }

    }

    static void findByColor() {
        System.out.print("Enter a color: ");
        String color = scanner.nextLine();
        for(Vehicle vehicle : vehicles){
            if (vehicle != null && vehicle.getColor().equalsIgnoreCase(color)){
                System.out.printf("VehicleID: %d, Make/Model: %s, Color: %s, Odometer: %d, Price: $%.2f%n",
                        vehicle.getVehicleId(),
                        vehicle.getMakeModel(),
                        vehicle.getColor(),
                        vehicle.getOdometerReading(),
                        vehicle.getPrice());
            }
        }
    }
    static void addVehicle(){
        if (vehicleCount >= vehicles.length){
            System.out.println("There are no more available slots.");
            return;
        }
        System.out.print("Enter vehicleID: ");
        long vehicleId = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Enter make/model: ");
        String makeModel = scanner.nextLine();
        System.out.print("Enter vehicle color: ");
        String vehicleColor = scanner.nextLine();
        System.out.print("Enter odometer reading: ");
        int odometer = scanner.nextInt();
        System.out.print("Enter the price of the vehicle: ");
        float vehiclePrice = scanner.nextFloat();

        Vehicle addVehicle = new Vehicle(
                vehicleId, makeModel, vehicleColor, odometer, vehiclePrice
        );
        vehicles[vehicleCount++] = addVehicle;
    }





}










