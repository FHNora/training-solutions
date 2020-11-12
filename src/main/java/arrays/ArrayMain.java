package arrays;

public class ArrayMain {
    public static void main(String[] args) {
        String [] days = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        System.out.println(days[1]);

        boolean [] trueOrFalse = {true, false, false, true, true, false};
        for (boolean isTrue : trueOrFalse){
            System.out.println(isTrue);
        }
    }
}
