package stringtype;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Registration registration = new Registration();
        System.out.println("Kérem adja meg a felhasználónevét!");
        String username = scanner.nextLine();
        System.out.println(username);

        System.out.println("Kérem adja meg a jelszavát kétszer!");
        String password1 = scanner.nextLine();
        System.out.println(password1);

        String password2 = scanner.nextLine();
        System.out.println(password2);
    }
}
