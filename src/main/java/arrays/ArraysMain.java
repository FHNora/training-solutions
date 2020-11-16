package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {
    public static String numberOfDaysAsString(){
        int [] numberOfDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        return Arrays.toString(numberOfDays);
    }

    public static List<String> daysOfWeek(){
        String [] daysOfWeek = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        return Arrays.asList(daysOfWeek);
    }

    public static String multiplicationTableAsString(int size){
        int [][] multiplicationTable = new int[size][size];
        for (int [] numbers : multiplicationTable){
            System.out.println(numbers);
        }
        return Arrays.toString(multiplicationTable);
    }

    public static void main(String[] args) {
        System.out.println(numberOfDaysAsString());
        System.out.println(daysOfWeek());
        System.out.println(multiplicationTableAsString(3));
    }
}
