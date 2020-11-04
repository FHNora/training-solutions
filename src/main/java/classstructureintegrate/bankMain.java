package classstructureintegrate;

public class bankMain {
    public static void main(String[] args) {
        bankAccount bankAccount = new bankAccount("19746352-00000000-23454898", "Kiss Tamás", 1200000);
        bankAccount anotherBankAccount = new bankAccount("76326512-00000000-76352198", "Kovács Pál", 4500000);
        System.out.println(bankAccount.getInfo());
        System.out.println(anotherBankAccount.getInfo());

        bankAccount.deposit(2000);
        System.out.println(bankAccount.getInfo());

        bankAccount.transfer(anotherBankAccount, 1000);
        System.out.println(anotherBankAccount.getInfo());
    }
}
