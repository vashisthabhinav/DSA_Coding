package DSA.Codechef;

import java.util.Arrays;
import java.util.Scanner;

public class CC_21_EndSorted_Optimized {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int[] P = new int[N];
            for (int i = 0; i < N; i++) {
                P[i] = sc.nextInt();
            }
            int[] sorted = new int[N];
            sorted = Arrays.copyOfRange(P,0,N);
            Arrays.sort(sorted);
            int count = 0;
            int smallest = sorted[0];
            int largest = sorted[N-1];
            int sIndex = 0;
            int lIndex = 0;
            for (int i = 0; i < N; i++) {
                if (P[i]==smallest) sIndex = i;
                if (P[i]==largest) lIndex = i;
            }
            count += sIndex;
            count += (N-1) - lIndex;
            if (sIndex>lIndex) count--;
            System.out.println(count);
            T--;
        }
    }
}
