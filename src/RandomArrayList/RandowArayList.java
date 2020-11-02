package RandomArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static java.lang.System.*;


public class RandowArayList extends ArrayList {

    private ArrayList data;

    public RandowArayList() {
        this.data = new ArrayList();
    }
    public  void getRandomElement(){
        for (int i = 0; i <100 ; i++) {
            data.add(i);
        }
        for (int i = 0; i <50 ; i++) {
            data.remove(i);
        }

        Collections.shuffle(data);
        Object n = data.get(0);
        System.out.println(n);

    }
}
