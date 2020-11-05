package stringtype;

public class UserValidator {

    public boolean isValidUsername(String username) {
        if (username == null) {
            return false;
        }
        return true;
    }

    public boolean isValidPassword(String password1, String password2) {
        if (password1.length() < 8) {
            return false;
        }
        if (password2.length() < 8) {
            return false;
        }
        if (password1.equals(password2)) {
            return true;
        }
        return true;
    }

    public boolean isValidEmail(String email){
        
    }
}
