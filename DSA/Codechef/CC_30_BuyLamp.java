package DSA.Codechef;

import java.util.Scanner;

public class CC_30_BuyLamp {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X>Y){
                System.out.println((X * K) + ((N-K) * Y));
            }else {
                System.out.println(X*N);
            }
            T--;
        }
    }
}
