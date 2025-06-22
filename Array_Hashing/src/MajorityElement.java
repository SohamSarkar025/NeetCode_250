import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,3,4,4,2,1};
        int res =majorityElement(nums);
        System.out.println(res);
    }
    public static int majorityElement(int[] num){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n:num) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            if(map.get(n) > (n/2)){
                return n;
            }
        }
        return -1;
    }
}
