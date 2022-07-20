package DSA.Codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class CF_10_ICPC_Balloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            int n = sc.nextInt();
            String s = sc.next();
            int count = 0;
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if (set.add(s.charAt(i))){
                    count += 2;
                }else {
                    count += 1;
                }
            }
            System.out.println(count);
            t--;
        }
    }
}
