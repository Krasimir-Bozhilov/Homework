package Vehicle;

public class Vehicle {
    private double fuelQuantity;
    private double litersPerKM;

    public Vehicle (double fuelQuantity, double litersPerKM){
        this.fuelQuantity=fuelQuantity;
        this.litersPerKM=litersPerKM;
    }

    public boolean drive(double distance){
        if (distance * litersPerKM <= fuelQuantity) {
            fuelQuantity -= distance * litersPerKM;
            return true;
        }
        return false;
    }
    public void refuel(double amount) {
        double currentFuel = getFuelQuantity();
        setFuelQuantity(currentFuel + amount);
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
        this.litersPerKM = litersPerKM;
    }
}
