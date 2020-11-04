package statements;

import java.util.Scanner;

public class timeMain {
    public static void main(String[] args) {

        System.out.println("Kérem adjon meg egy időpontot!");
        Scanner scanner = new Scanner(System.in);
        int hour, minute, second;
        hour = scanner.nextInt();
        minute = scanner.nextInt();
        second = scanner.nextInt();
        time firstTime = new time(hour, minute, second);
        System.out.println(firstTime.getInMinutes());

        System.out.println("Kérem adjon meg még egy időpontot!");
        hour = scanner.nextInt();
        minute = scanner.nextInt();
        second = scanner.nextInt();
        time secondTime = new time(hour, minute, second);
        System.out.println(secondTime.getInSeconds());

        System.out.println(firstTime.earlierThan(secondTime));
    }
}
