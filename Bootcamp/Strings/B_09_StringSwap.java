package Bootcamp.Strings;

import java.util.HashSet;

public class B_09_StringSwap {
    public static void main(String[] args) {
        String s1 = "aaz", s2 = "zaa";
        System.out.println(areAlmostEqual(s1,s2));
    }
    public static boolean areAlmostEqual(String s1, String s2) {
        //The answer is false if the number of non-equal positions in the strings is not equal to 0 or 2.
        if (s1.length() != s2.length()) return false;
        int nonEquals = 0;
        char[] charS1 = new char[2];
        char[] charS2 = new char[2];
        for (int i = 0; i < s1.length() ; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (nonEquals>=2) return false;
                charS1[nonEquals] = s1.charAt(i);
                charS2[nonEquals] = s2.charAt(i);
                nonEquals++;
            }
        }
        if (charS1[0]==charS2[1] && charS1[1]==charS2[0]) return true;
        return false;
    }
}
