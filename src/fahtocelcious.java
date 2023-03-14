import java.util.Scanner;

public class fahtocelcious {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature ");
        double a = sc.nextDouble();
        System.out.println("Enter the unit c for celsius f for fahrenheit");
        String degree = sc.next();
        if (degree.toLowerCase().equals("f")) {
            System.out.println((a - 32) / 1.8);
        } else if (degree.toLowerCase().equals("c")) {
            System.out.println((a * 1.8) + 32);
        }
    }
}
