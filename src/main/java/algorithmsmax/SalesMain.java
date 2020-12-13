package algorithmsmax;

import java.util.List;

public class SalesMain {

    public static String bestSalesperson(List<Salesperson> salesperson){
        int max = 0;
        for (Salesperson bs : salesperson) {
            String best = bs.getName();
            if (bs.getAmount() > bs.getTarget()) {
                max = bs.getAmount();
            }
        }
        return ;
    }
}
