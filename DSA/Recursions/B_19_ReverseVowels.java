package DSA.Recursions;

import java.util.HashSet;

public class B_19_ReverseVowels {
    public static void main(String[] args) {
        String s = ".,";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        helper(chars,0,chars.length-1);
        StringBuilder ans = new StringBuilder();
        for (char aChar : chars) {
            ans.append(aChar);

        }
        return ans.toString();
    }

    private static void helper(char[] chars, int start, int end) {
        if (start>=end) return;
        start = isVowelStart(chars,start);
        end = isVowelEnd(chars,end);
        if (start>=end) return;
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
        helper(chars,++start,--end);
    }

    public static int isVowelEnd(char[] chars, int end) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        while (end>0 && !set.contains(chars[end])) end--;
        return end;
    }

    public static int isVowelStart(char[] chars, int start) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        while (start<chars.length && !set.contains(chars[start])) start++;
        return start;
    }
}
