package DSA.Codechef;

import java.util.Scanner;

public class CC_24_TrueAndFalsePaper {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            System.out.println(N-K);
            T--;
        }
    }
}
