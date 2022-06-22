package DSA.Algorithms.SlidingWindow;

import java.util.HashMap;

public class S_08_LongestK_UniqueCharacters {
    public static void main(String[] args) {
        String S = "meayl";
        int k = 2;
        System.out.println(longestkSubstr(S,k));
    }
    public static int longestkSubstr(String s, int k) {
        int i = 0 , j = 0 , longest = -1 , longInSub = 0 , n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        while (j<n){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            if (map.size()<k){
                j++;
            }else if(map.size()==k){
                longInSub  = j-i+1;
                longest = Math.max(longest,longInSub);
                j++;
            }else{
                while (map.size()>k){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                    if (map.get(s.charAt(i))==0){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        return longest;
    }
}
