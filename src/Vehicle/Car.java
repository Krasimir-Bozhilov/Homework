package Vehicle;

public class Car extends Vehicle {
    public Car(double fuelQuantity, double litersPerKM) {
        super(fuelQuantity, litersPerKM+0.9);
    }
}
