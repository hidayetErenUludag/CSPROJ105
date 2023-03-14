import java.util.Scanner;

public class CsHomwrok1 {
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
        int[][] reformedNums = new int[a][b];
        int number = 0;
        for (int k = 0; k < a; k++){
            boolean hasNoZero = true;
            for(int z = 0; z < b ; z++){
                if (reformedNums[k][z] != 0){
                    hasNoZero = false;
                    break;
                }
            }
            if (hasNoZero) {
                reformedNums[number] = nums[k];
                for (int j = 0; j < b; j++) {
                    System.out.print(nums[k][j] + " ");
                    number++;
                }


            }
        }
    }
}

