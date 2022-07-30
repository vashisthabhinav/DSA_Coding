package DSA.Codechef;

import java.util.Scanner;

public class CC_29_FillCandies {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int M = sc.nextInt();
            int capacity = K * M;
            int ans = 0;
            while (N>0){
                N -= capacity;
                ans++;
            }
            System.out.println(ans);
            T--;
        }
    }
}
