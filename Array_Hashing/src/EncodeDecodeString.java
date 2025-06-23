//Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.
//
//Please implement encode and decode
//
//Example 1:
//
//Input: ["neet","code","love","you"]
//
//Output:["neet","code","love","you"]
//Example 2:
//
//Input: ["we","say",":","yes"]
//
//Output: ["we","say",":","yes"]

//Simply Copy Paste it , it will work on leetcode or neetcode
class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s:strs){
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> list = new ArrayList<>();
        int i=0;
        while( i < str.length()){
            int j = i;
            while( str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            list.add(str.substring(j+1,j+1+len));
            i = j+1+len;
        }
        return list;
    }
}
