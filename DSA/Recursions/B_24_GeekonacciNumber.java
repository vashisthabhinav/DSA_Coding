package DSA.Recursions;

import java.util.Scanner;

public class B_24_GeekonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int N = sc.nextInt();
            N = N - 3;
            int D = 0;
//            while(N>0){
//                D = A + B + C;
//                A = B;
//                B = C;
//                C = D;
//                N--;
//            }
            System.out.println(helper(A,B,C,D,N));
            T--;
        }
    }
    public static int helper(int A, int B, int C, int D, int N){
        if(N==0){
            return D;
        }
        D = A + B + C;
        A = B;
        B = C;
        C = D;
        return helper(A, B, C, D, --N);
    }
}
