package classstructureio;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        System.out.println("Írjon be két számot!");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(num1 + num2);
    }
}
