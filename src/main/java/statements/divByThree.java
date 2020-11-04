package statements;

import java.util.Scanner;

public class divByThree {
    public static void main(String[] args) {
        System.out.println("Kérem adjon meg egy egész számot!");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.println(num);
        if (num%3 ==0) {
            System.out.println("A szám osztható 3-mal");
        }
    }
}
