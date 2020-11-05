package stringtype;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserValidator userValidator = new UserValidator();
        System.out.println("Kérem adja meg a felhasználónevét!");
        String username = scanner.nextLine();
        System.out.println(username);
        System.out.println(userValidator.isValidUsername(username) ? "Érvényes felhasználónév" : "Érvénytelen felhasználónév");

        System.out.println("Kérem adja meg a jelszavát kétszer!");
        String password1 = scanner.nextLine();
        System.out.println(password1);
        String password2 = scanner.nextLine();
        System.out.println(password2);
        System.out.println(userValidator.isValidPassword(password1, password2) ? "Érvényes jelszó" : "Érvénytelen jelszó");

        System.out.println("Kérem adja meg az email címét!");
        String email = scanner.nextLine();
        System.out.println(email);
        System.out.println(userValidator.isValidEmail(email) ? "Érvényes email cím" : "Érvénytelen email cím");


    }
}
