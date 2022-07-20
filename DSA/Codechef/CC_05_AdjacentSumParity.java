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
            boolean oneCount = false;
            for (int i = 0; i < N-1; i++) {
                if (A[i]==1){
                    oneCount = !oneCount;
                }
            }
            if (oneCount && A[N-1]==1){
                System.out.println("YES");
            }else if (!oneCount && A[N-1]==0){
                System.out.println("YES");
            }else System.out.println("NO");
            T--;
        }
    }
}
/*
When do we get 0’s in B? We will get 0s if both Ai and Ai+1 are even or both are odd. When 2 numbers are even or both numbers are odd, their sum is necessarily even.
When do we get 1’s in B? We will get 1s if either Ai is even and Ai+1 is odd or vice-versa
 */