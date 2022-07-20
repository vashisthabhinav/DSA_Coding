package DSA.Codechef;

import java.util.Scanner;

public class CC_23_InteriorDesign {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X1 = sc.nextInt();
            int Y1 = sc.nextInt();
            int X2 = sc.nextInt();
            int Y2 = sc.nextInt();
            System.out.println(Math.min(X1 + Y1, X2 + Y2));
            T--;
        }
    }
}
