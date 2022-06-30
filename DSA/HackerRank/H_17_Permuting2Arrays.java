package DSA.HackerRank;

import java.util.Collections;
import java.util.List;

public class H_17_Permuting2Arrays {
    public static void main(String[] args) {

    }
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        Collections.sort(A);
        Collections.sort(B);
        Collections.reverse(B);
        boolean ans = true;
        String s = "";
        int n = A.size();
        for (int i = 0; i < n; i++) {
            if ((A.get(i) + B.get(i)) < k) {
                ans = false;
                break;
            }
        }
        if (ans){
            s = "YES";
        }else{
            s = "NO";
        }
        return s;
    }
}
