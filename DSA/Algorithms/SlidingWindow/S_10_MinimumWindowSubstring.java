package DSA.Algorithms.SlidingWindow;

import java.util.HashMap;

public class S_10_MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "totmtaptat" , t = "tta";
        System.out.println(minWindow(s,t));
    }
    public static String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        int i = 0 , j = 0 , n = s.length() , count = map.size() ,
                minimum = Integer.MAX_VALUE , minI = 0 , minJ = 0;
        while (j<n){
            if (map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                if (map.get(s.charAt(j))==0){
                    count--;
                }
            }
            if (count>0) j++;
            else{
                while (count == 0) {
                    int slidingWindow = j - i + 1;
                    if (minimum > slidingWindow) {
                        minimum = slidingWindow;
                        minI = i;
                        minJ = j + 1;
                    }
                    if(map.containsKey(s.charAt(i))){
                        map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                        if(map.get(s.charAt(i))== 1){
                            count++;
                        }
                    }
                    i++;
                }
                j++;
            }
        }
        return s.substring(minI,minJ);
    }
}
