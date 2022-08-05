package DSA.Codeforces;

import java.util.Scanner;

public class CF_25MinimumVariedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t>0){
            int s = sc.nextInt();
            int maxNum = 9;
            StringBuilder str = new StringBuilder();
            while (s>0){
                if (s-maxNum>0){
                    s = s - maxNum;
                    str.append(maxNum);
                    maxNum--;
                }else{
                    str.append(s);
                    s = 0;
                }
            }
            for (int i = str.length()-1; i >=0; i--) {
                System.out.print(str.charAt(i));
            }
            System.out.println();
            t--;
        }
    }
}
