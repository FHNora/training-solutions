package stringbuilder;

public class Palindrome {

    public boolean isPalindrome(String word){
        StringBuilder sb = new StringBuilder(word);
        return sb.toString().equals(sb.reverse().toString());
    }

}
