package DSA.Codechef;

import java.util.Scanner;

public class CC_03_ChefApps {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T>0){
            int S = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            int space = S - (X+Y);
            int ans = 0;
            if (space>=Z){
                System.out.println(0);
            }
            else {
                if (space + X >= Z) ans++;
                else if (space + Y >= Z) ans++;
                else ans +=2;
                System.out.println(ans);
            }
            T--;
        }
    }
}
