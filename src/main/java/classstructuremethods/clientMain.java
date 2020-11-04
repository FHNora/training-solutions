package classstructuremethods;

import java.util.Scanner;

public class clientMain {
    public static void main(String[] args) {
        client client = new client ();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a nevét!");
        client.setName(scanner.nextLine());

        System.out.println("Kérem adja meg a születési évét!");
        client.setYear(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Kérem adja meg a lakcímét!");
        client.setAddress(scanner.nextLine());

        client.migrate("360 Marshall Road Phoenix 28700");
        System.out.println("Költözés sikeres, új cím: " + client.getAddress());

    }
}

