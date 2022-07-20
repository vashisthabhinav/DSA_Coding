package DSA.Codechef;

import java.util.Scanner;

public class CC_20_ConstructN {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            if (N==1) System.out.println("NO");
            else if (N==3) System.out.println("NO");
            else if (N==5) System.out.println("NO");
            else System.out.println("YES");
            T--;
        }
    }
}
