package DSA.Codechef;

import java.util.Arrays;
import java.util.Scanner;

public class CC_21_EndSorted {
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
            while (P[0] != smallest){
                for (int i = 0; i < N; i++) {
                    if (P[i]==smallest){
                        swap(P,i,i-1);
                        count++;
                    }
                }
            }
            while (P[N-1] != largest){
                for (int i = 0; i < N-1; i++) {
                    if (P[i] == largest){
                        swap(P,i,i+1);
                        count++;
                    }
                }
            }
            System.out.println(count);
            T--;
        }
    }

    private static void swap(int[] p, int i, int j) {
        int temp = p[i];
        p[i] = p[j];
        p[j] = temp;
    }
}
