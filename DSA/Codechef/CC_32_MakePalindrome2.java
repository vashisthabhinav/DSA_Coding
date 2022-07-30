package DSA.Codechef;

import java.util.Scanner;

public class CC_32_MakePalindrome2 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            String S = sc.next();
            StringBuilder string = new StringBuilder();
            string.append(S);
            int maxSteps = N/2;
            int steps = 0;
            int i = 0;
            int j = N-1;
            while (i < string.length() && j>i){
                if (string.charAt(i) == string.charAt(j)){
                    i++;
                    j--;
                }
                else{
                    if (i+1<N && string.charAt(i+1)==string.charAt(j)){
                        string.deleteCharAt(i);
                        i++;
                        j-=2;
                        N--;
                        steps++;
                    }else {
                        string.deleteCharAt(j);
                        j--;
                        i++;
                    }
                }
            }
            System.out.println(string);
            T--;
        }
    }
}
