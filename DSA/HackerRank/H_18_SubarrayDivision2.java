package DSA.HackerRank;

import java.util.Collections;
import java.util.List;

public class H_18_SubarrayDivision2 {
    public static void main(String[] args) {

    }
    public static int birthday(List<Integer> s, int d, int m) {
        //Sliding window
        int ans = 0;
        int n = s.size();
        int i = 0 , j = 0 , sum = 0;
        while (j<n){
            sum += s.get(j);
            if (j-i+1 < m){
                j++;
            }else{
                if (sum == d){
                    ans++;
                }
                sum -= s.get(i);
                i++;
                j++;
            }
        }
        return ans;
    }
}
