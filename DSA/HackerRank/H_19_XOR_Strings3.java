package DSA.HackerRank;

import java.util.Scanner;

public class H_19_XOR_Strings3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(stringsXOR(s,t));
    }

    private static String stringsXOR(String s, String t) {
        int xor = 0 , sString, tString;
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n ; i++) {
            sString = Integer.parseInt(String.valueOf(s.charAt(i)));
            tString = Integer.parseInt(String.valueOf(t.charAt(i)));
            xor = sString^tString;
            ans.append(xor);
        }
        return ans.toString();
    }
}