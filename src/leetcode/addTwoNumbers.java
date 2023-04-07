package leetcode;

class addTwoNumbers {
    public int[] fullAdder(int[] nums1,  int[] nums2) {
        int[] newArr;
        int[] shortArr = new int[Math.min(nums1.length, nums2.length)];
        if (nums1.length > nums2.length) {
             newArr = nums1;
        }
        else {
            newArr = nums2;
        }

        int[] resultArr = new int[newArr.length+1];

        int i = 0;
        int plusOne = 0;
        while(i < newArr.length){
            if(i< shortArr.length){
                resultArr[i] = nums1[i]+nums2[i]+plusOne;
                if (resultArr[i]>=10){
                    resultArr[i] -= 10;
                    plusOne = 1;
                }
                else{
                    plusOne = 0;
                }
            }
            else{
                if (Math.min(nums1.length, nums2.length) == nums2.length) {
                    resultArr[i] = nums2[i];
                }
                else{
                    resultArr[i] = nums1[i];
                }
            }
        i++;
        }
    return resultArr;
    }
}