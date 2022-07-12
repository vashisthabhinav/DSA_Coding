package DSA.Codechef;

import java.util.Arrays;
import java.util.Scanner;

public class CC_14_GameOfPilesVersion1 {
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
            int currPile;
            int pointer  = 0;
            boolean  ans = false;
            for (int i = 0; i < N; i++) {
                currPile = piles[i];
                if (currPile == 1) {
                    System.out.println("CHEF");
                    ans = true;
                    break;
                }else {
                    while (currPile>2){
                        pointer = 1-pointer;
                        currPile--;
                    }
                }
            }
            if (!ans && pointer==1) {
                System.out.println("CHEF");
            }
            else if (!ans && pointer==0){
                System.out.println("CHEFINA");
            }
            T--;
        }
    }
}
