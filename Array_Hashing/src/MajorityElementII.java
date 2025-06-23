//You are given an integer array nums of size n, find all elements that appear more than ⌊ n/3 ⌋ times. You can return the result in any order.
//
//        Example 1:
//
//        Input: nums = [5,2,3,2,2,2,2,5,5,5]
//
//        Output: [2,5]
//        Example 2:
//
//        Input: nums = [4,4,4,4,4]
//
//        Output: [4]

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public ArrayList<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num) > n/3 && !list.contains(num)){
                list.add(num);
            }
        }
        return list;
    }
}