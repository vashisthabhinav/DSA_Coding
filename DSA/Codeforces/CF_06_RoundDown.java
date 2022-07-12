package DSA.Codeforces;

import java.util.Scanner;

public class CF_06_RoundDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t>0){
            long m = sc.nextInt();
            int digits = -1;
            long n = m;
            while (m>0){
                m = m/10;
                digits++;
            }
            long roundOff = (long) Math.pow(10,digits);
            System.out.println(n-roundOff);
            t--;
        }
    }
}
