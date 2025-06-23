Products of Array Except Self
        Solved
//Given an integer array nums, return an array output where output[i] is the product of all the elements of nums except nums[i].
//
//Each product is guaranteed to fit in a 32-bit integer.
//
//Follow-up: Could you solve it in
//O
//        (
//                n
//                )
//O(n) time without using the division operation?
//
//Example 1:
//
//Input: nums = [1,2,4,6]
//
//Output: [48,24,12,8]
//Example 2:
//
//Input: nums = [-1,0,1,2,3]
//
//Output: [0,-6,0,0,0]


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] left = new int[nums.length];
        left[0]=1;
        int[] right = new int[nums.length];
        right[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            left[i]=nums[i-1]*left[i-1];
        }
        for(int j=nums.length-2;j>-1;j--){
            right[j]=nums[j+1]*right[j+1];
        }
        for(int p=0;p<nums.length;p++){
            res[p]=left[p]*right[p];
        }
        return res;
    }
}
