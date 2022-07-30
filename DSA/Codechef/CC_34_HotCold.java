package DSA.Codechef;

import java.util.Scanner;

public class CC_34_HotCold {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T>0){
            int N = sc.nextInt();
            if (N>20) System.out.println("HOT");
            else System.out.println("COLD");
            T--;
        }
    }
}
