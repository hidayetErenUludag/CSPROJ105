package banking.model;

public class bankAccount {
    private double balance = 0;

    public double  withdraw(double amount){
        balance = balance-amount-10;
        return 10;
    }

    public boolean deposit(double amount){
        balance = balance + amount*1.11;
        return true;
    }

    public double checkBalance(){
        return balance;
    }
}
