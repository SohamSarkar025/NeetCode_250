//Contains Duplicate
//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
//
//Example 1:
//
//Input: nums = [1, 2, 3, 3]
//
//Output: true
//
//Example 2:
//
//Input: nums = [1, 2, 3, 4]
//
//Output: false

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(isContainsDuplicate(nums));

    }
    static boolean isContainsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            else{
                set.add(num);
            }
        }
        return false;
    }
}
