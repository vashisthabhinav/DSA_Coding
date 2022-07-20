package DSA.Codechef;

import java.util.Scanner;

public class CC_18_ChessTime {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            N = N*60;
            System.out.println(N/20);
            T--;
        }
    }
}
