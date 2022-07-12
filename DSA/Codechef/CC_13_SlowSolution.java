package DSA.Codechef;

import java.util.Scanner;

public class CC_13_SlowSolution {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int iterations = Integer.parseInt(sc.nextLine());
        while (iterations >0){
            int maxT = sc.nextInt();
            int maxN = sc.nextInt();
            int sumN = sc.nextInt();
            long ans = 0;
            int currentSum = 0;
            for (int i = 0; i < maxT; i++) {
                if (currentSum + maxN <= sumN){
                    currentSum += maxN;
                    ans += Math.pow(maxN,2);
                }else {
                    int n = sumN - currentSum;
                    ans += Math.pow(n,2);
                    break;
                }
            }
            System.out.println(ans);
            iterations--;
        }
    }
}
