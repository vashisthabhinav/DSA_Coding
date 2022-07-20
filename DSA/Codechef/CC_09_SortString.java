package DSA.Codechef;

import java.util.Scanner;

public class CC_09_SortString {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            String s = sc.next();
            //We just have to check for adjacent 10 pairs as they are the only ones to be sorted.
            int ans = 0;
            for (int i = 0; i < N-1; i++) {
                if (s.charAt(i)=='1'){
                    if (s.charAt(i+1)=='0'){
                        //This pair needs to be sorted
                        ans++;
                    }
                }
            }
            System.out.println(ans);
            T--;
        }
    }
}
