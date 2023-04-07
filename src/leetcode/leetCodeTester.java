package leetcode;

public class leetCodeTester {
    public static void main(String[] args) {
        Solution sum1 = new Solution();
        int[] nums = {2, 7, 11, 15, 9, 10, 3, 8, 9, 4, 1};
        int[] result = sum1.twoSum(nums, 12);
        System.out.println("Indices of the two numbers that sum up to target: " + result[0] + ", " + result[1]);


        int[] arr1 = {2, 8, 3, 7, 4, 2, 3, 8, 9, 4, 9};
        int[] arr2 = {2, 7, 1, 9, 5, 4, 3, 8, 2, 4, 9};
        addTwoNumbers sumNum = new addTwoNumbers();
        int[] result2 = sumNum.fullAdder(arr1, arr2);
        for (int i = 0; i< result2.length; i++){
            System.out.print(result2[i]);
        }
    }
}
