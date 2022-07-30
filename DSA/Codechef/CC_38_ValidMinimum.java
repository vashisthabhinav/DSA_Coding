package DSA.Codechef;

import java.util.*;

public class CC_38_ValidMinimum {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int[] A = new int[3];
            for (int i = 0; i < 3; i++) {
                A[i] = sc.nextInt();
            }
            int a = A[0];
            int b = A[1];
            int c = A[2];
            if (a!=b && b != c && a!=c){
                System.out.println("NO");
            }else if (a==b && b<=c) System.out.println("YES");
            else if (b==c && a>=b) System.out.println("YES");
            else if (a==c && c<=b) System.out.println("YES");
            else System.out.println("NO");
            T--;
        }
    }
}