package DSA.Codechef;

import java.util.Scanner;

public class CC_04_ChangeRowOrColumnBoth {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T>0){
            int W = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            int ans = 1;
            if (W==Y) ans++;
            if (X==Z) ans++;
            System.out.println(ans);
            T--;
        }
    }
}
