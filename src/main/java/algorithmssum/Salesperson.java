package algorithmssum;


import java.util.ArrayList;
import java.util.List;

public class Salesperson {
    private String name;
    private int amount;
    private List<Integer> salesperson = new ArrayList<>();

    public Salesperson (String name, int amount, List<Integer> salesperson){
        this.name = name;
        this.amount = amount;
        salesperson.add(amount);
    }

    public int getAmount(){
        return amount;
    }
}
