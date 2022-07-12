package DSA.Codechef;

import java.util.Scanner;

public class CC_02_AirHockey {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A>B){
                System.out.println(7-A);
            }else {
                System.out.println(7-B);
            }
            T--;
        }
    }
}
