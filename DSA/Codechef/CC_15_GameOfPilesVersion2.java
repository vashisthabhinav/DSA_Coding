package DSA.Codechef;

import java.util.Arrays;
import java.util.Scanner;

public class CC_15_GameOfPilesVersion2 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T>0){
            int N = sc.nextInt();
            int[] piles = new int[N];
            for (int i = 0; i < N; i++) {
                piles[i] = sc.nextInt();
            }
            Arrays.sort(piles);
            long count = 0;
            int pointer  = 0;
            for (int i = 0; i < N; i++) {
                count = piles[i] - 1;
                if (count%2==1){
                    pointer = 1 - pointer;
                }
            }
            if (pointer == 1){
                System.out.println("CHEF");
            }else {
                System.out.println("CHEFINA");
            }
            T--;
        }
    }
}
