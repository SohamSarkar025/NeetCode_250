//Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
//
//        An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
//
//        Example 1:
//
//        Input: strs = ["act","pots","tops","cat","stop","hat"]
//
//        Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
//        Example 2:
//
//        Input: strs = ["x"]
//
//        Output: [["x"]]
//        Example 3:
//
//        Input: strs = [""]
//
//        Output: [[""]]
import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"tea","ate","bad"};
        List<List<String>> result = groupAnagram(strs);
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
    static List<List<String>> groupAnagram(String[] strs){
        HashMap<String,List<String>> map = new HashMap<>();
        //Checking for every string
        for(String s : strs){
            //Creating a count array to store the frequency.
            int[] count = new int[26];
            //For Generating  the frequency
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append(count[i]);
                sb.append('#');
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
