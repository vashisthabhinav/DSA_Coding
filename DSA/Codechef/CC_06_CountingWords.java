package DSA.Codechef;

import java.util.Scanner;

public class CC_06_CountingWords {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T>0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(N*M);
            T--;
        }
    }
}
