package DSA.Codechef;

import java.util.Scanner;

public class CC_22_CopyAndPushBack {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            String string = sc.next();
            StringBuilder str = new StringBuilder();
            int i = 0;
            boolean operation1 = true;
            while (i<N){
                if (operation1){
                    str.append(string.charAt(i));
                    i++;
                }else {
                    String currStr = str.toString();
                    int currStrLen = currStr.length();
                    str.append(currStr);
                    i += currStrLen;
                }
                operation1 = !operation1;
            }
            if (str.toString().equals(string)) System.out.println("YES");
            else System.out.println("NO");
            T--;
        }
    }
}
