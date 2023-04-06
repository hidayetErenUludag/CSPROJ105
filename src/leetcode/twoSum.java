package leetcode;

class Solution {
     public int[] twoSum(int[] nums, int target){
         int[] newArray = new int[2];
         for (int i = nums.length; i < nums.length; i++){
             for (int j = 0; j< nums.length && i!= j; j++ ){
                 if (nums[i]+nums[j] == target){
                     newArray[0] = i;
                     newArray[1] = j;
                     return newArray;
                 }
             }
         }
         return newArray;
     }
}
