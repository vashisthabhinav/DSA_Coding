package DSA.Recursions;

import java.util.Arrays;

public class B_17_ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
//        reverseString1(s);
        System.out.println(Arrays.toString(s));
        reverseString2(s);
        System.out.println(Arrays.toString(s));
    }
    public static void reverseString1(char[] s) {
        char[] ans = new char[s.length];
        helper1(s,ans,0,s.length-1);
        System.out.println(Arrays.toString(ans));
    }

    private static void helper1(char[] s, char[] ans, int sIndex, int ansIndex) {
        if (sIndex==s.length) return;
        ans[ansIndex--] = s[sIndex++];
        helper1(s,ans,sIndex,ansIndex);
    }
    public static void reverseString2(char[] s) {
        helper2(s,0,s.length-1);
    }

    public static void helper2(char[] s, int start, int end) {
        if (start>=end) return;
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        helper2(s,++start,--end);
    }
}
