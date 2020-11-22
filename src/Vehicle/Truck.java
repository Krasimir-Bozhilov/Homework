package Vehicle;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double litersPerKM) {
        super(fuelQuantity*0.95, litersPerKM+1.6);
    }
}
