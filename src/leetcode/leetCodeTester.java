package leetcode;

public class leetCodeTester {
    public static void main(String[] args) {
        Solution sum1 = new Solution();
        int[] nums = {2, 7, 11, 15, 9, 10, 3, 8, 9, 4, 1};
        int[] result = sum1.twoSum(nums, 12);
        System.out.println("Indices of the two numbers that sum up to target: " + result[0] + ", " + result[1]);
    }
}
