//Given an integer array nums and an integer k, return the k most frequent elements within the array.
//
//The test cases are generated such that the answer is always unique.
//
//You may return the output in any order.
//
//        Example 1:
//
//Input: nums = [1,2,2,3,3,3], k = 2
//
//Output: [2,3]
//Example 2:
//
//Input: nums = [7,7], k = 1
//
//Output: [7]

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        //Counting the frequency
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //Creating bukcet to store the frequency
        for(int key : map.keySet()){
            //Frquency Calculating for individual i
            int frequency = map.get(key);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int[] res=new int[k];
        int counter=0;
        for(int p=nums.length;p >= 0 && counter < k;p--){
            if(bucket[p]!=null){
                for(Integer integer : bucket[p]){
                    res[counter]=integer;
                    counter++;
                }
            }
        }
        return res;
    }
}

