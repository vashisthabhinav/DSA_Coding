package DSA.Codeforces;

import java.util.Scanner;

public class CF_21_AlsoTryMinecraft_Optimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        int[] quests = new int[2*m];
        for (int i = 0; i < quests.length; i++) {
            quests[i] = sc.nextInt();
        }
        int[] leftToRight = new int[n];
        int[] rightToLeft = new int[n];
        int fallDamage1 = 0;
        int fallDamage2 = 0;

        for (int i = 0; i < n - 1; i++) {
            if (heights[i]>heights[i+1]){
                fallDamage1 += heights[i] - heights[i+1];
            }
            else {
                fallDamage2 += heights[i+1] - heights[i];
            }
            leftToRight[i+1] = fallDamage1;
            rightToLeft[i+1] = fallDamage2;
        }
        int index = 0;
        while (index < 2*m){
            int s = quests[index] - 1;
            int t = quests[index + 1] - 1;
            if (s>t){
                System.out.println(Math.abs(rightToLeft[t] - rightToLeft[s]));
            }else {
                System.out.println(Math.abs(leftToRight[t] - leftToRight[s]));
            }
            index += 2;
        }
    }
}
