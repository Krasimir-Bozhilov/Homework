package Vehicle;

public class Vehicle {
    private int fuelQuantity;
    private int litersPerKM;

    public Vehicle (int fuelQuantity, int litersPerKM){
        this.fuelQuantity=fuelQuantity;
        this.litersPerKM=litersPerKM;
    }

    public int getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(int fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public int getLitersPerKM() {
        return litersPerKM;
    }

    public void setLitersPerKM(int litersPerKM) {
        this.litersPerKM = litersPerKM;
    }
}
