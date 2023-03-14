package elma;

import java.util.Scanner;

public class CsHomework1  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows ");
        int a = sc.nextInt();
        System.out.println("enter the number of columns ");
        int b = sc.nextInt();
        int[][] nums = new int[a][b];
        for (int i = 0; i<a; i++){
            for (int j = 0; j<b; j++){
                System.out.println("Please enter the number for " + i + " " + j);
                nums[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a; i++){
            boolean NoZero = true;
            for (int j = 0; j < b; j++){
                if(nums[i][j] == 0){
                    NoZero = false;
                    break;
                }
            }
            if (NoZero){
                for (int j = 0; j < b; j++){
                    System.out.print(nums[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
