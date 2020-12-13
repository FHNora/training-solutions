package algorithmsmax;

import java.util.ArrayList;
import java.util.List;

public class SalesMain {

    public static String bestSalesperson(List<Salesperson> salesperson){
        int max = 0;
        String best = "";
        for (Salesperson bs : salesperson) {
            if (bs.getAmount() > max) {
                max = bs.getAmount();
                best = bs.getName();
            }
        }
        return best;
    }

    public static String absolut(List<Salesperson> salesperson){
        int max = 0;
        String best = "";
        for (Salesperson ab : salesperson) {
            if (ab.getAmount() - ab.getTarget() > max) {
                max = ab.getAmount() - ab.getTarget();
                best = ab.getName();
            }
        }
        return best;
    }

    public static String last(List<Salesperson> salesperson){
        int max = 0;
        String last = "";
        for (Salesperson l : salesperson) {
            if (l.getTarget() - l.getAmount() > max) {
                max = l.getTarget() - l.getAmount();
                last = l.getName();
            }
        }
        return last;
    }

    public static void main(String[] args) {

        List<Salesperson> salesperson = new ArrayList<>();
        Salesperson salesperson1 = new Salesperson("John", 180_000, 50_000);
        Salesperson salesperson2 = new Salesperson("Jack", 100_000,30_000);
        Salesperson salesperson3 = new Salesperson("Jane", 200_000,190_000);
        Salesperson salesperson4 = new Salesperson("Kate", 80_000, 100_000);
        Salesperson salesperson5 = new Salesperson("Bjorn", 50_000, 100_000);

        salesperson.add(salesperson1);
        salesperson.add(salesperson2);
        salesperson.add(salesperson3);
        salesperson.add(salesperson4);
        salesperson.add(salesperson5);

        System.out.println(bestSalesperson(salesperson));
        System.out.println(absolut(salesperson));
        System.out.println(last(salesperson));

    }
}
