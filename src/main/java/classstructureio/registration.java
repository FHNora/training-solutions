package classstructureio;

import java.util.Scanner;

public class registration {
    public static void main(String[] args) {
        System.out.println("Kérem adja meg a nevét!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Kérem adja meg az email címét!");
        String emailAdress = scanner.nextLine();
        System.out.println("Az alábbi adatokkal regisztrált: " + "Név: " + name +"," + " email cím: " + emailAdress);

    }
}
