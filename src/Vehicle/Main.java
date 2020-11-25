package Vehicle;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carInfo = scanner.nextLine().split("\\s+");
        String[] truckInfo = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        double carFuelQuantity = Double.parseDouble(carInfo[1]);
        double carLitersPerKM = Double.parseDouble(carInfo[2]);
        double truckFuelQuantity = Double.parseDouble(truckInfo[1]);
        double truckLitersPerKM = Double.parseDouble(truckInfo[2]);
        Car car = new Car(carFuelQuantity, carLitersPerKM);
        Truck truck = new Truck(truckFuelQuantity, truckLitersPerKM);
        NumberFormat format = DecimalFormat.getInstance();
        format.setMinimumFractionDigits(0);



        for (int i = 0; i < n; i++) {

            String[] tokens = scanner.nextLine().split("\\s+");
            switch (tokens[0]) {
                case "Drive":
                    double distance = Double.parseDouble(tokens[2]);
                    if (tokens[1].equals("Car")) {
                        boolean driven = car.drive(distance);
                        if (driven == true) {

                            System.out.println("Car travelled "+format.format(distance)+ " km");
                        } else if (driven == false) {
                            System.out.println("Car needs refueling");

                        }
                    } else if (tokens[1].equals("Truck")) {
                        boolean driven = truck.drive(distance);
                        if (driven == true) {

                            System.out.println("Truck travelled "+format.format(distance)+ " km");
                        } else if (driven == false) {
                            System.out.println("Truck needs refueling");
                        }
                    }
                    break;

                case "Refuel":
                    double fuel = Double.parseDouble(tokens[2]);
                    if (tokens[1].equals("Car")) {
                        car.refuel(fuel);
                    }   else if (tokens[1].equals("Truck")) {
                        truck.refuel(fuel);
                    }
                    break;
            }

        }
        System.out.printf("Car: %.2f\n",car.getFuelQuantity());
        System.out.printf("Truck: %.2f\n",truck.getFuelQuantity());
    }
}
