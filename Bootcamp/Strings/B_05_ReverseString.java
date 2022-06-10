package Bootcamp.Strings;

import java.util.Arrays;

public class B_05_ReverseString {
    public static void main(String[] args) {
        char[] ch = {'h','e','l','l','o'};
        System.out.println(Arrays.toString(ch));
        reverseString(ch);
        System.out.println(Arrays.toString(ch));
    }
    public static void reverseString(char[] s) {
        //Q344
        for (int i = 0; i < s.length/2 ; i++) {
            char ch = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = ch;
        }
    }
}
