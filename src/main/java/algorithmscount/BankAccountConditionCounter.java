package algorithmscount;

import java.util.ArrayList;
import java.util.List;

public class BankAccountConditionCounter {

    public static int countAccount(List<BankAccount> bankAccount, int balanceMin){
        int count = 0;
        for (BankAccount acc : bankAccount) {
            if (acc.getBalance() > balanceMin) {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<BankAccount> bankAccount = new ArrayList<>();
        BankAccount bankAccount1 = new BankAccount("John", "1653724180", 100_000);

    }
}
