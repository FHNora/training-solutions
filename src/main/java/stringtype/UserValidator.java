package stringtype;

public class UserValidator {

    public boolean isValidUsername(String username) {
        if (username == null) {
            return false;
        }
        return true;
    }

    public boolean isValidPassword(String password1, String password2) {
        if (password1.length() < 8 || password2.length() < 8) {
            return false;
        }
        if (password1.equals(password2)) {
            return true;
        }
        return true;
    }

    public boolean isValidEmail(String email){
        if (email.indexOf("@") == -1 || email.indexOf(".") == -1){
            return false;
        }
        if (email.indexOf("@") == 0){
            return false;
        }
        return true;
    }
}
