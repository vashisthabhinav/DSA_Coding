package DSA.Codechef;

import java.util.Scanner;

public class CC_28_FairPass {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            if (K>N) System.out.println("YES");
            else System.out.println("NO");
            T--;
        }
    }
}
