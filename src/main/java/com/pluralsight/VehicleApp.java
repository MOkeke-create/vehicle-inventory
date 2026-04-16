package com.pluralsight;

import java.util.Scanner;
public class VehicleApp {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[6];
        vehicles[0] = new Vehicle(101121,"Ford Explorer","Red",45000,13500);
        vehicles[1] = new Vehicle(101122,"Toyota Camry","Blue",60000,11000);
        vehicles[2] = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700);
        vehicles[3] = new Vehicle(101124,"Honda Civic","White",70000,7500);
        vehicles[4] = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        vehicles[5] = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);

//        boolean programIsRunning = true;
//        while (programIsRunning){
//            System.out.println("""
//                    What do you want to do?
//                    1 - List all vehicles
//                    2 - Search by make/model
//                    3 - Search by price range
//                    4 - Search by color
//                    5 - Add a vehicle
//                    6 - Quit
//                    Enter your command: """);

//            int command = scanner.nextInt();
//            switch (command){
//                case 1:
//                listOfVehicles();
//                break;
//                case 2:
//                    findVehiclesByPrice();
//                    break;
//                case 5:
//                    addAVehicle();
//                    break;
//                case 6:
//                   return;




        for (Vehicle vehicle : vehicles) {
                System.out.printf("VehicleID: %d, Make/Model: %s, Color: %s, Odometer: %d, Price: $%.2f%n",
                        vehicle.getVehicleId(),
                        vehicle.getMakeModel(),
                        vehicle.getColor(),
                        vehicle.getOdometerReading(),
                        vehicle.getPrice());

            }

//        //public void findVehiclePrice(){
//            for (Vehicle vehicle : vehicles)
//        }



    }




}
