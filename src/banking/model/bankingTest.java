package banking.model;

public class bankingTest {
    public static void main(String[] args) {
        bankAccount accountAyşe = new bankAccount();
        accountAyşe.deposit(1000);
        bankAccount accountEce = new bankAccount();
        accountEce.deposit(9000);
        System.out.println((accountEce.checkBalance() +" "+ accountAyşe.checkBalance()));
    }
}
