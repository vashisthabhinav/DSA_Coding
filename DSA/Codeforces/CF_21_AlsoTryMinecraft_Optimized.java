package DSA.Codeforces;

import java.util.Scanner;

public class CF_21_AlsoTryMinecraft_Optimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] heights = new int[n];
        int[] quests = new int[2*m];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        for (int i = 0; i < 2*m; i++) {
            quests[i] = sc.nextInt();
        }
        int[] ans = new int[m];
        
        for (int j = 0; j < ans.length; j++) {
            System.out.println(ans[j]);
        }
    }
}
