package algorithmsdecision;

import java.util.ArrayList;
import java.util.List;

public class BankMain {

    public static boolean isBankAccount(List<BankAccount> bankAccounts, int limit) {
        for (BankAccount ba : bankAccounts) {
            if (ba.getBalance() > limit) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        List<BankAccount> bankAccounts = new ArrayList<>();
        BankAccount bankAccount1 = new BankAccount("John", "1298745", 100_000);
        BankAccount bankAccount2 = new BankAccount("Jack", "1879525", 200_000);
        BankAccount bankAccount3 = new BankAccount("Jane", "1658799", 250_000);
        BankAccount bankAccount4 = new BankAccount("Kate", "1921574", 500_000);
        bankAccounts.add(bankAccount1);
        bankAccounts.add(bankAccount2);
        bankAccounts.add(bankAccount3);
        bankAccounts.add(bankAccount4);
        System.out.println(isBankAccount(bankAccounts, 250_000));
    }

}
