package DSA.Codechef;

import java.util.Scanner;

public class CC_07_Math1Enrolment {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X>=Y) System.out.println(0);
            else System.out.println(Y-X);
            T--;
        }
    }
}
