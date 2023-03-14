import java.util.Scanner;

public class stupidAssTask {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int counter = 0;
        do {
            System.out.println("Enter a number");
            int a = sc.nextInt();
            total += a;
            counter++;
        } while (total <= 100);
        System.out.println("The number is "+ total);
        System.out.println((double)total/counter);

    }
}

