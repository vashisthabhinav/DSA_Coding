package DSA.Codechef;

import java.util.Scanner;

public class CC_09_SortString {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T>0){
            int N = Integer.parseInt(sc.nextLine());
            String s = sc.nextLine();
            char[] chars = new char[N];
            for (int i = 0; i < N; i++) {
                chars[i] = s.charAt(i);
            }
            boolean result = true;
            for (int i = 1; i < N; i++) {
                if (chars[i]<chars[i-1]) result = false;
            }
            if (result) System.out.println(0);
            int ans = 0, window = 0;
            if (!result){
                for (int i = 0; i < N; i++) {
                    if (chars[i] == '1'){
                        for (int j = i+1; j < N; j++) {
                            if (chars[j] == '0'){
                                window++;
                            }else if (chars[j]== '1' && chars[j-1] == '1'){
                                window++;
                            }else {
                                ans++;
                                i = j-1;
                                window = 0;
                                break;
                            }
                            if (j==N-1 && window!= 0){
                                i = j;
                                ans++;
                                window = 0;
                            }
                        }
                        if (i+1==N-1 && chars[i+1] == '0'){
                            ans++;
                        }
                    }
                }
                System.out.println(ans);
            }

            T--;
        }
    }
}
