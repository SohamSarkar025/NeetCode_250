//You are given an integer array nums and an integer val. Your task is to remove all
// occurrences of val from nums in-place.
//
//After removing all occurrences of val, return the number of remaining elements,
// say k, such that the first k elements of nums do not contain val.
//
// Note:
//
//The order of the elements which are not equal to val does not matter.
//It is not necessary to consider elements beyond the first k positions of the array.
//To be accepted, the first k elements of nums must contain only elements not equal to val.
//Return k as the final result.
//
//        Example 1:
//
//Input: nums = [1,1,2,3,4], val = 1
//
//Output: [2,3,4]
//Explanation: You should return k = 3 as we have 3 elements which are not equal to val = 1.

public class RemoveElement {
    public static void main(String[] args) {
        int[] num = {1,1,1,2,3,4};
        int val=1;
        int res =removeElement(num,val);
        System.out.println(res);
    }
    public static int removeElement(int[] num,int val){
        int k=0;
        for(int i=0;i<num.length;i++){
            if(num[i]!=val){
                num[k]=num[i];
                k++;
            }
        }
        return k;
    }
}
