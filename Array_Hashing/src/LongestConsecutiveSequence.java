//Longest Consecutive Sequence
//        Solved
//Given an array of integers nums, return the length of the longest consecutive sequence of elements that can be formed.
//
//A consecutive sequence is a sequence of elements in which each element is exactly 1 greater than the previous element. The elements do not have to be consecutive in the original array.
//
//You must write an algorithm that runs in O(n) time.
//
//Example 1:
//
//Input: nums = [2,20,4,10,3,4,5]
//
//Output: 4
//Explanation: The longest consecutive sequence is [2, 3, 4, 5].
//
//Example 2:
//
//Input: nums = [0,3,2,5,4,6,1,1]
//
//Output: 7

class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        int highLength=0;
        for(int num:nums){
            map.put(num,Boolean.FALSE);
        }
        for(int num:nums){
            int currLength=1;
            int nextNum =num+1;
            while(map.containsKey(nextNum) && map.get(nextNum)==false){
                map.put(nextNum,Boolean.TRUE);
                currLength++;
                nextNum++;
            }
            int preNum=num-1;
            while(map.containsKey(preNum) && map.get(preNum)==false){
                map.put(preNum,Boolean.TRUE);
                currLength++;
                preNum--;
            }
            highLength = Math.max(currLength,highLength);
        }
        return highLength;
    }
}
