package DSA.Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class CF_13_MarkThePhotographer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t>0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] heights = new int[2*n];
            for (int i = 0; i < 2*n; i++) {
                heights[i] = sc.nextInt();
            }
            Arrays.sort(heights);
            int[] front = new int[n];
            int[] back = new int[n];
            int i = 0;
            for (i = 0; i < n; i++) {
                front[i] = heights[i];
            }
            for (int j = 0; j < n; j++) {
                back[j] = heights[i++];
            }
            boolean ans = true;
            for (int j = 0; j < n; j++) {
                if (back[j] - front[j] < x){
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
