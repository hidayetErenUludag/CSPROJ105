import java.util.Arrays;
import java.util.Random;
public class arrays {
    public static void main(String[] args) {
        Random num = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++){
            arr[i] = num.nextInt(20);
        }
        System.out.println(Arrays.toString(arr));
        int counter = 0;
        for (int j = 0; j < arr.length; j++){
            if (arr[j]< 1){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
