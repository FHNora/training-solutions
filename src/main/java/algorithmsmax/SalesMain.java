package algorithmsmax;

import java.util.ArrayList;
import java.util.List;

public class SalesMain {

    public static String bestSalesperson(List<Salesperson> salesperson){
        int max = 0;
        String best = "";
        for (Salesperson bs : salesperson) {
            if (bs.getAmount() > bs.getTarget()) {
                max = bs.getAmount();
                best = bs.getName();
            }
        }
        return best;
    }

    public static String absolut(List<Salesperson> salesperson){
        int max = 0;
        for (Salesperson ab : salesperson) {
            (ab.getTarget() - ab.getAmount()) == int difference;
        }
    }

    public static void main(String[] args) {

        List<Salesperson> salesperson = new ArrayList<>();
        Salesperson salesperson1 = new Salesperson("John", 100_000, 50_000);
        Salesperson salesperson2 = new Salesperson("Jack", 100_000,30_000);
        Salesperson salesperson3 = new Salesperson("Jane", 100_000,10_000);

        salesperson.add(salesperson1);
        salesperson.add(salesperson2);
        salesperson.add(salesperson3);

        System.out.println(bestSalesperson(salesperson));

    }
}
