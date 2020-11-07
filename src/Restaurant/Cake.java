package Restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert {
    private final 	double CAKE_GRAMS = 250;
    private final double CAKE_CALORIES = 1000;
    private  final 	 BigDecimal CAKE_PRICE = new BigDecimal(5);

   public Cake(String name,BigDecimal CAKE_PRICE,double CAKE_CALORIES,double CAKE_GRAMS){
       super(name, CAKE_PRICE,CAKE_CALORIES,CAKE_GRAMS);
   }
}
