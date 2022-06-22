package DSA.Algorithms.SlidingWindow;

import java.util.HashMap;

public class S_09_LongestSubStringUniqueChars {
    public static void main(String[] args) {
        String s = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int longest = 0 , longInSub = 0 , n = s.length() , i = 0 , j = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while (j<n){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            int slidingWindow = j-i+1;
            if (map.size()==slidingWindow){
                longInSub = map.size();
                longest = Math.max(longest,longInSub);
                j++;
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if (map.get(s.charAt(i))==0){
                    map.remove(s.charAt(i));
                }
                i++;
                j++;
            }
        }
        return longest;
    }
}
