package algorithmssum;

public class Transaction {
    private String accountNumber;
    private enum transactionOperation{CREDIT, DEBIT};
    private int amount;

    public Transaction(String accountNumber, int amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
}
