package Vehicle;

public class Truck extends Vehicle {
    private final static double fuelConsumption = 1.6;

    public Truck(double fuelQuantity, double litersPerKM) {
        super(fuelQuantity, litersPerKM + fuelConsumption);
    }

    @Override
    public void refuel(double amount) {
        super.refuel(amount * 0.95);
    }
}

