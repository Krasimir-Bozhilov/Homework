package Vehicle;

public class Car extends Vehicle {
    private final static double fuelConsumption=0.9;
    public Car(double fuelQuantity, double litersPerKM) {
        super(fuelQuantity, litersPerKM+fuelConsumption);
    }
}
