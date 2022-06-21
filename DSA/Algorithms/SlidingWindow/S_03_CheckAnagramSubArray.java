package DSA.Algorithms.SlidingWindow;

import java.util.HashMap;

public class S_03_CheckAnagramSubArray {
    public static void main(String[] args) {
        String txt = "aabaabaa";
        String pat = "aaba";
        System.out.println(search(pat,txt));
    }
    public static int search(String pat, String txt) {
        int i = 0 , j = 0 , ans = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int k = 0; k < pat.length() ; k++) {
            map.put(pat.charAt(k),map.getOrDefault(pat.charAt(k),0)+1);
            //Key is f and count of f is value
        }
        int count = map.size();
        while (j < txt.length()){
            if (map.containsKey(txt.charAt(j))){
                map.put(txt.charAt(j),map.get(txt.charAt(j))-1);
                if (map.get(txt.charAt(j))==0){
                    count--;
                }
            }
            if (j-i+1<pat.length()){
                j++;
            }else{
                if (count==0){
                    ans++;
                }
                if (map.containsKey(txt.charAt(i))){
                    if (map.get(txt.charAt(i))==0){
                        count++;
                    }
                    map.put(txt.charAt(i),map.get(txt.charAt(i))+1);
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
