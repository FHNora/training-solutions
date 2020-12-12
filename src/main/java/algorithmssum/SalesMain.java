package algorithmssum;

import java.util.ArrayList;
import java.util.List;

public class SalesMain {

    public static int sum(List<Salesperson> amounts) {
        int sum = 0;
        for (Salesperson i : amounts) {
            sum += i.getAmount();
        }
        return sum;
    }

    public void main(String[] args) {

        List<Salesperson> salesPerson = new ArrayList<>();

        Salesperson salesperson = new Salesperson("Rita", 2000);

        salesPerson.add(salesperson);

        int sum = sum(salesPerson);

        System.out.println(sum);

    }

}
