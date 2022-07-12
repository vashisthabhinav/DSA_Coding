package DSA.Codechef;

import java.util.Scanner;

public class CC_12_ChefAndCandies {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T>0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int reqCandies = N-X;
            int count = 0;
            while (reqCandies>0){
                reqCandies = reqCandies - 4;
                count++;
            }
            System.out.println(count);
            T--;
        }
    }
}
