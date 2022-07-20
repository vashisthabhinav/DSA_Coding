package DSA.Codechef;

import java.util.Scanner;

public class CC_26_LastLevels {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            int ans = X*Y;
            if (X>3){
                ans += (X/3)*Z;
                if (X%3==0) ans-= Z;
            }
            System.out.println(ans);
            T--;
        }
    }
}
