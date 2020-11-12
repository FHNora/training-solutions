package arrays;

public class ArrayMain {
    public static void main(String[] args) {
        String[] days = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        System.out.println(days[1]);
        System.out.println(days.length);

        boolean[] trueOrFalse = {false, false, true, true, true, false};
        for (int i = 0; i < trueOrFalse.length; i++){
            System.out.println(trueOrFalse[i]);
        }
    }
}
