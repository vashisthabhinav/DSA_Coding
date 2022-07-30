package DSA.Codechef;

import java.util.Scanner;

public class CC_36_OnOff {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            String S = sc.next();
            String R = sc.next();
            int change = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) != R.charAt(i)){
                    change++;
                }
            }
            if (change%2==0) System.out.println(1);
            else System.out.println(0);
            T--;
        }
    }
}
