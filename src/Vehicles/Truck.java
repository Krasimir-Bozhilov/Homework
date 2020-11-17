package Vehicles;

public class Truck implements Vehicle {
    //fuel quantity, fuel consumption in liters per km
    private double fuelQuantity;
    private double litersPerKM;
    public Truck(double fuelQuantity, double litersPerKM){
        this.fuelQuantity=fuelQuantity;
        this.litersPerKM=litersPerKM;
    }
    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getLitersPerKM() {
        return litersPerKM;
    }

    public void setLitersPerKM(double litersPerKM) {
        this.litersPerKM = litersPerKM*1.6;
    }

    @Override
    public int driving(double distance) {
        return 0;
    }

    @Override
    public int reFueling(double fuel) {
        return 0;
    }
}
