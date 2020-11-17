package Vehicles;

public class Car implements Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private double litersPerKM=0.9;
    public Car(int fuelConsumption,int fuelQuantity, int litersPerKM){
        this.fuelConsumption=fuelConsumption;
        this.fuelQuantity=fuelQuantity;
        this.litersPerKM=litersPerKM;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(int fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getLitersPerKM() {
        return litersPerKM;
    }

    public void setLitersPerKM(int litersPerKM) {
        this.litersPerKM = litersPerKM;
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
