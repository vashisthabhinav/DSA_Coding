package DSA.Codeforces;

import java.util.Scanner;

public class CF_16_DifferenceOperationsOptimized {
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
            for (int i = n-1 ; i > 0 ; i--) {
                a[i] = a[i] % a[i-1];
            }
            for (int i = n - 1; i > 0; i--) {
                if (a[i]>0){
                    int j = i-1;
                    while (j >= 0 ){
                        if (a[j] != 0 && a[i] % a[j] == 0) {
                            a[i] = 0;
                           break;
                        }
                        j--;
                    }
                    if (a[i] != 0) {
                        ans = false;
                        break;
                    }
                }
            }
            if (ans) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
