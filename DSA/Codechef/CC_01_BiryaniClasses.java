package DSA.Codechef;

import java.util.Scanner;

public class CC_01_BiryaniClasses {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            System.out.println(X*Y);
            T--;
        }
    }
}
