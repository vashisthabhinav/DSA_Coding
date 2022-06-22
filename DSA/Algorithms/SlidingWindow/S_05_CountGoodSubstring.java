package DSA.Algorithms.SlidingWindow;

import java.util.ArrayList;
import java.util.HashSet;

public class S_05_CountGoodSubstring {
    public static void main(String[] args) {
        String s = "aababcabc";
        System.out.println(countGoodSubstrings1(s));
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
    public static int countGoodSubstrings1(String s) {
        ArrayList<Character> substring = new ArrayList<>();
        int i = 0 , j = 0 , good =0 , n = s.length();
        while (j<n){
            substring.add(s.charAt(j));
            if (j-i+1<3){
                j++;
            }else{
                HashSet<Character> unique = new HashSet<>();
                for (int k = 0 ; k < substring.size() ; k++) {
                    unique.add(substring.get(k));
                }
                if (unique.size()==3) good++;
                substring.remove(0);
                i++;
                j++;
            }
        }
        return good;
    }

}
