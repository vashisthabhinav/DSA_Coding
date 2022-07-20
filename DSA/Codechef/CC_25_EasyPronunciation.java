package DSA.Codechef;

import java.util.HashSet;
import java.util.Scanner;

public class CC_25_EasyPronunciation {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            String S = sc.next();
            HashSet<Character> set = new HashSet<>();
            set.add('a');
            set.add('e');
            set.add('i');
            set.add('o');
            set.add('u');
            int count = 0;
            boolean ans = true;
            for (int i = 0; i < N; i++) {
                if (!set.contains(S.charAt(i))){
                    count++;
                }else count = 0;
                if (count==4) {
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
