package DSA.Codechef;

import java.util.Scanner;

public class CC_11_PassExam {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int totalScore = A + B + C;
            if (totalScore>=100){
                if (A >= 10 && B >= 10 && C >= 10){
                    System.out.println("PASS");
                }else {
                    System.out.println("FAIL");
                }
            }
            else {
                System.out.println("FAIL");
            }
            T--;
        }
    }
}
