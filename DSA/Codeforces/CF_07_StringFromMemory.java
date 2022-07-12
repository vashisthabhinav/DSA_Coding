package DSA.Codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class CF_07_StringFromMemory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t>0){
            String s = sc.nextLine();
            HashSet<Character> set = new HashSet<>();
            int i = 0 , j = 0 , n = s.length() , day = 0;
            while (i<n){
                set.add(s.charAt(i));
                i++;
                while (i<n && set.size()==3){
                    if (set.contains(s.charAt(i))){
                        i++;
                    }else {
                        day++;
                        set.clear();
                    }
                }
            }
            if (!set.isEmpty()) day++;
            System.out.println(day);
            t--;
        }
    }
}
