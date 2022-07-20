package DSA.Codeforces;

import java.util.Objects;
import java.util.Scanner;

public class CF_12_DoubleStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String[] s = new String[n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.next();
            }
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                ans[i] = 0;
            }
            for (int i = 0; i < n; i++) {
                String currStr = s[i];
                for (int j = 0; j < n; j++) {
                    if (ans[i] == 1) break;
                    String first = s[j];
                    if (first.length() < currStr.length()) {
                        for (int k = 0; k < n; k++) {
                            if (k != i) {
                                String second = s[k];
                                if (Objects.equals(currStr, first + second)) {
                                    ans[i] = 1;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < n - 1; i++) {
                System.out.print(ans[i]);
            }
            System.out.println(ans[n - 1]);
            t--;
        }
    }
}