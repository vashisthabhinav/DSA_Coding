package Bootcamp.Strings;

import java.util.Locale;

public class B_02_Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String str) {
        //Q125
        str = str.toLowerCase();
        StringBuilder s = new StringBuilder(str.replaceAll("[^a-zA-Z0-9]", ""));
        if (s==null || s.length()==0) return true;
        for (int i = 0; i <= s.length()/2; i++) {
            int start = s.charAt(i);
            int end = s.charAt(s.length()-1-i);
            if (start!=end){
                return false;
            }
        }
        return true;
    }
}
