package DSA.Codechef;

import java.util.Scanner;

public class CC_05_AdjacentSumParity {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T>0){
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int ones = 0 ;
            for (int i = 0; i < N; i++) {
                if (A[i] == 1) ones++;
            }
            if (ones ==0 || ones == N/2 ) System.out.println("YES");
            else System.out.println("NO");
            T--;
        }
    }
}
