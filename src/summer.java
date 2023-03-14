import java.util.Scanner;
public class summer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a the first num");
        long a = sc.nextInt();
        System.out.println("Please enter a the second num");
        long b = sc.nextInt();
        long total = 0;
        while (a <= b){
            total += a;
            a++;
        }
        System.out.println(total);
    }
}
