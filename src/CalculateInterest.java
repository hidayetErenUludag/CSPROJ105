import java.util.Locale;
import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args) {
        double interestRate = 0.1;
        System.out.println("Enter The Amount You Want To Deposit");
        Scanner sc = new Scanner(System.in);
        int bankBalance = sc.nextInt();
        System.out.println("How many months you want to hold your money");
        int holdingDuration = sc.nextInt();
        System.out.println("The interest rate is %10.0");
        int i = 0;
        double j = bankBalance;
        while (i < holdingDuration) {
            j += (j * interestRate);
            i++;
        }
        System.out.printf(Locale.ENGLISH,"'%5.2f'%n", j);
    }
}
