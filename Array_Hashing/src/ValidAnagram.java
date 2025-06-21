import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "dacb";
        System.out.println( isAnagram(s,t));
    }

    //Using Bruteforce Method
//    static boolean isAnagram(String s , String t){
//        int[] count = new int[26];
//        if(s.length()!=t.length()){
//            return false;
//        }
//        else{
//            for(int i=0;i<s.length();i++){
//                count[s.charAt(i)-'a']++; //Increase the index for the character in Count[]
//                count[t.charAt(i)-'a']--;   //Decrease the index for the character in Count[]
//            }
//        }
//        for(int val:count){
//            if(val!=0){
//                return false;
//            }
//        }
//        return true;
//    }

    //Using HashMap
    static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character , Integer> map = new HashMap<>();
        // Count frequency of each character in string s
        for(char ch :s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        // Subtract frequency using characters in string t
        for(char ch : t.toCharArray()){
            if(!map.containsKey(ch)){
                return false;
            }
            map.put(ch,map.get(ch)-1);
            if(map.get(ch) < 0){
                return false;
            }
        }
        return true;
    }
}

