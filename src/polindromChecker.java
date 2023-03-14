import java.util.Scanner;

public class polindromChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter  a number");
        int num = sc.nextInt();
        int backNum = num;
        int reversedNumber = 0;
        while (backNum != 0) {
            int digit = backNum % 10;
            reversedNumber = reversedNumber * 10 + digit;
            backNum /= 10;
        }
        if (reversedNumber == num){
            System.out.println("The number is palindrome");

        } else{
            System.out.println("The number is not a palindrome ");
        }


    }
}
