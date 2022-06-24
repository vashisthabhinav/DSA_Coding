package DSA.HackerRank;

import java.util.List;

public class H_06_DivisibleSumPairs {
    public static void main(String[] args) {

    }
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int ans = 0;
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = i+1 ; j < n ; j++){
                int dividend = ar.get(i) + ar.get(j);
                if(dividend%k==0){
                    ans++;
                }
            }
        }
        return ans;
    }
}
