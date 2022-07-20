package DSA.Codeforces;

import java.util.Scanner;

public class CF_09_YesOrYes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t>0){
            String s = sc.nextLine();
            char[] chars = new char[6];
            chars[0] = 'y';
            chars[1] = 'Y';
            chars[2] = 'e';
            chars[3] = 'E';
            chars[4] = 's';
            chars[5] = 'S';
            boolean ans = true;
            int j = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != chars[j] ){
                    if (s.charAt(i) != chars[j+1]){
                        ans = false;
                        break;
                    }
                }
                    j += 2;
            }
            if (ans) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
