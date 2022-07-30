package DSA.Codechef;

import java.util.Arrays;
import java.util.Scanner;

public class CC_35_MaxTaste {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int [] A = new int[2];
            for (int i = 0; i < 2; i++) {
                A[i] = sc.nextInt();
            }
            int [] B = new int[2];
            for (int i = 0; i < 2; i++) {
                B[i] = sc.nextInt();
            }
            Arrays.sort(A);
            Arrays.sort(B);
            System.out.println(A[1]+B[1]);
            T--;
        }
    }
}
