import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,4,6,4};
        int target=8;
        int[] res=twoSumB(arr,target);
        System.out.println(Arrays.toString(res));
    }
    static int[] twoSum(int[] arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            //Determine complement of the target by the number in the array.
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return new int[] {};
    }
    static int[] twoSumB(int[] num,int target){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]+num[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
