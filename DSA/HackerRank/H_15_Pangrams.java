package DSA.HackerRank;

import java.util.HashSet;

public class H_15_Pangrams {
    public static void main(String[] args) {
        String s = "We promptly judged antique ivory buckles for the next prize";
        System.out.println(pangrams(s));
    }
    public static String pangrams(String s) {
        String ans;
        s = s.toLowerCase();//Converts all the letters to lower case
        s = s.replaceAll(" ","");//Removes all the spaces
        HashSet<Character> hash = new HashSet<>();
        for(int i = 0 ; i < s.length() ; i++){
            hash.add(s.charAt(i));
        }
        if(hash.size()==26){
            ans = "pangram";
        }else{
            ans = "not pangram";
        }
        return ans;
    }
}
