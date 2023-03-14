import java.util.Arrays;

public class arrays_2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 10);
        }
        int counter1 = 0;
        for (int j:nums) {
            if (nums[j] < 1) {
                counter1++;
            }
        }
        int counter2 = 0;
        for (int j:nums) {
            if (nums[j] > 7) {
                counter2++;
            }
        }
        int counter3 = 0;
        for (int j:nums) {
            counter3 += nums[j];
        }
        double average = (counter3 / 100);
        int counter4 = 0;
        for (int j:nums) {
            if (nums[j] > average) {
                counter4++;
            }
        }
        System.out.println(" smaller than 1 "+ counter1 + " Bigger than 7  "+ counter2 + " average "+average+
                " bigger than average "+ counter4);
        System.out.println(Arrays.toString(nums));

        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println(timeElapsed + " millisecond");
    }
}