package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        System.out.println("1. Felhasználók");
        System.out.println("2. Felhasználó felvétele");
        System.out.println("Többi: kilépés");
        System.out.println("Adjon meg egy számot!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1){
            System.out.println("Felhasználók listázása");
        }
        if (number == 2){
            System.out.println("Felhasználó felvétele");
        }
        else {
            System.out.println(" ");
        }
    }
}
