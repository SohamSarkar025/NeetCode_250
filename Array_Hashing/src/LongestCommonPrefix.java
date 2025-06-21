//You are given an array of strings strs. Return the longest common prefix of all the strings.
//
//If there is no longest common prefix, return an empty string "".
//
//Example 1:
//
//Input: strs = ["bat","bag","bank","band"]
//
//Output: "ba"
//Example 2:
//
//Input: strs = ["dance","dag","danger","damage"]
//
//Output: "da"
//Example 3:
//
//Input: strs = ["neet","feet"]
//
//Output: ""


import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs ={"bat","bag","bank","band"};
        System.out.println(longestCPrefix(strs));
    }
    static String longestCPrefix(String[] str){

        //Create a string type variable to store the result
        StringBuilder result = new StringBuilder();

        //Sorting the array
        Arrays.sort(str);

        char[] first=str[0].toCharArray();
        char[] last = str[str.length-1].toCharArray();

        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }
}
