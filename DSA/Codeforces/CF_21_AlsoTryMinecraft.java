package DSA.Codeforces;

import java.util.Scanner;

public class CF_21_AlsoTryMinecraft {
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
        int i = 0;
        int index = 0;
        while (i< 2*m){
            int start = quests[i] - 1 ;
            int end = quests[i+1] - 1;
            if (end>start){
                for (int j = start; j < end ; j++) {
                    if (j+1< n && heights[j]>heights[j+1]){
                        ans[index] += heights[j] - heights[j+1];
                    }
                }
            }else{
                for (int j = start; j > end ; j--) {
                    if (heights[j]>heights[j-1]){
                        ans[index] += heights[j] - heights[j-1];
                    }
                }
            }
            index++;
            i +=2;
        }
        for (int j = 0; j < ans.length; j++) {
            System.out.println(ans[j]);
        }
    }
}
