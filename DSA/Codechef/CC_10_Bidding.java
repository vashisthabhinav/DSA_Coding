package DSA.Codechef;

import java.util.Scanner;

public class CC_10_Bidding {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (A>B){
                if (A>C){
                    System.out.println("Alice");
                }else {
                    System.out.println("Charlie");
                }
            }else {
                if (B>C){
                    System.out.println("Bob");
                }else {
                    System.out.println("Charlie");
                }
            }
            T--;
        }
    }
}
