package DSA.Codechef;

import java.util.Scanner;

public class CC_17_MinCoinsRequired {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            System.out.println(X%10);
            T--;
        }
    }
}
