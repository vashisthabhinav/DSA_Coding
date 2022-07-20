package DSA.Codeforces;

import java.util.Scanner;

public class CF_16_DifferenceOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t>0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            boolean ans = true;

            int i = n-1;
            while (i>0){
                if (a[i]-a[i-1]<0){
                    ans = false;
                    break;
                }
                while (a[i]>a[i-1]){
                    a[i] -= a[i-1];
                }
                i--;
            }
            for (int j = n-1; j > 0; j--) {
                if (a[j] % a[j-1] != 0 && a[j-1] != 0) {
                    ans = false;
                    break;
                }
            }
            if (ans) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
