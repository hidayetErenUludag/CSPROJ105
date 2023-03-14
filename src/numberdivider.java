import java.util.Scanner;

public class numberdivider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        int digit;
        int position = 1;
        while (number > 0){
            digit = number % 10;
            System.out.println("Digit at position " + position + ": " + digit);
            position++;
            number /= 10;


        }
    }
}