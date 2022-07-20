package DSA.Codechef;

import java.util.HashMap;
import java.util.Scanner;

public class CC_27_YetAnotherPalindrome {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            String A = sc.next();
            HashMap<Character,Integer> map = new HashMap<>();
            boolean ans = true;
            for (int i = 0; i < N; i++) {
                map.put(A.charAt(i), map.getOrDefault(A.charAt(i),0) + 1);
            }
            for (int iter: map.values()) {
                if (iter%2 != 0){
                    ans = false;
                    break;
                }
            }
            if (ans) System.out.println("YES");
            else System.out.println("NO");
            T--;
        }
    }
}
