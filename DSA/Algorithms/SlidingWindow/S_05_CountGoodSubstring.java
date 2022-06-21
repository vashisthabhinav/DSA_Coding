package DSA.Algorithms.SlidingWindow;

import java.util.HashSet;

public class S_05_CountGoodSubstring {
    public static void main(String[] args) {
        String s = "xyzzaz";
        System.out.println(countGoodSubstrings(s));
    }
    public static int countGoodSubstrings(String s) {
        //Brute Force Method
        int ans = 0;
        HashSet<Character> set= new HashSet<>();
        for(int i=0; i<s.length()-2;i++){
            set.add(s.charAt(i));
            set.add(s.charAt(i+1));
            set.add(s.charAt(i+2));
            if(set.size()==3){
                ans++;
            }
            set.remove(s.charAt(i));
        }
        return ans;
    }

}
