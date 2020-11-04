package classstructureintegrate;

public class bankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public bankAccount (String accountNumber, String owner, int balance){
    this.accountNumber = accountNumber;
    this.owner = owner;
    this.balance = balance;
    }

    public void deposit(int amount){
        amount+=balance;
    }

    public void withdraw(int amount){
        amount-=balance;
    }

    public void transfer(bankAccount to, int amount){
        to.deposit(amount);
        withdraw(amount);
    }

    public String getInfo(){
        String info = owner + " " + "(" + accountNumber + ")" + ":" + " " + balance + " " + "Ft";
        return info;
    }

}
