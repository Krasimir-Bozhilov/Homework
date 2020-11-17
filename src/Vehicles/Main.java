package Vehicles;

import DefineAnInterfacePerson.Identifiable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carInfo = scanner.nextLine().split("\\s+");
        double carQantity = Double.parseDouble(carInfo[1]);
        double carPerKM = Double.parseDouble(carInfo[2]);
        Car car = new Car(carQantity, carPerKM);
        String[] truckInfo = scanner.nextLine().split("\\s+");
        double truckQantity = Double.parseDouble(truckInfo[1]);
        double truckPerKM = Double.parseDouble(truckInfo[2]);
        Car truck = new Car(truckQantity, truckPerKM);
        car.setFuelQuantity(carQantity);
        car.setLitersPerKM(carPerKM);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            switch (command[0]) {
                case "Drive":
                    if (command[1].equals("Car")){
                        double distance=Double.parseDouble(command[2]);
                        car.driving(distance);
                    }
                    break;
                case :
                    break;
            }
        }


    }
}
