package classstructureio;

import java.util.Scanner;

public class clientMain {

    public static void main(String[] args) {
        client client = new client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a nevét!");
        client.name = scanner.nextLine();
        System.out.println("Kérem adja meg a születési évét!");
        client.year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem adja meg a lakcímét!");
        client.address = scanner.nextLine();
        System.out.println(client.name);
        System.out.println(client.year);
        System.out.println(client.address);
    }

}
