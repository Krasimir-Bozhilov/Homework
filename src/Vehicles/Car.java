package Vehicles;

public class Car implements Vehicle {
    private double fuelQuantity;
    private double litersPerKM;
    public Car(double fuelQuantity, double litersPerKM){
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
        this.litersPerKM = litersPerKM*0.9;
    }

    @Override
    public double driving(double distance) {

    }

    @Override
    public double reFueling(double fuel) {
        return 0;
    }
}
