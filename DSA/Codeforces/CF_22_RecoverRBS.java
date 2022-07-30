package DSA.Codeforces;

import java.util.HashMap;
import java.util.Scanner;

public class CF_22_RecoverRBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t>0){
            String s = sc.next();
            HashMap<Character,Integer> map = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
            if (map.getOrDefault('?',0) == 0 || map.getOrDefault('?',0) == 1){
                System.out.println("YES");
            }else{
                int start = map.getOrDefault('(',0);
                int end = map.getOrDefault(')',0);
                int length = s.length();
                int questions = length - start - end;
                if ( questions == 1 || questions == 2){
                    System.out.println("YES");
                }else System.out.println("NO");
            }
            t--;
        }
    }
}
