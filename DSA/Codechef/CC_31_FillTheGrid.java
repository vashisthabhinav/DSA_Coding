package DSA.Codechef;

import java.util.Scanner;

public class CC_31_FillTheGrid {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            if (N%2==0 && M%2==0){
                System.out.println(0);
            }else {
                int n , m;
                if (N%2 !=0 ) n = N - 1;
                else n = N;
                if (M%2 !=0 ) m = M - 1;
                else m = M;
                System.out.println((N*M) - (n*m));
            }
            T--;
        }
    }
}
