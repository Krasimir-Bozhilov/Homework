package Restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {
    private double caffeine;
    private final BigDecimal COFFEE_PRICE = new BigDecimal(3.5);
    private final double COFFEE_MILLILITERS = 50;

    public Coffee(String name, BigDecimal COFFEE_PRICE, double COFFEE_MILLILITERS, double caffeine) {
        super(name, COFFEE_PRICE, COFFEE_MILLILITERS);
        this.caffeine=caffeine;

    }

    public double getCaffeine() {
        return caffeine;
    }
}
