package algorithmsmax;

import java.util.ArrayList;
import java.util.List;

public class IntegerMaxCalculator {

    public static int maxCalculator(List<Integer> numbers) {
        int max = 0;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(16);
        numbers.add(4);
        numbers.add(0);
        numbers.add(34);
        numbers.add(9);
        numbers.add(48);
        numbers.add(731);
        numbers.add(63);

        System.out.println(maxCalculator(numbers));
    }
}
