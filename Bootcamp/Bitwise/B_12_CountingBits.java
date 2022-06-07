package Bootcamp.Bitwise;

import java.util.Arrays;

public class B_12_CountingBits {
    public static void main(String[] args) {
        int n =5;
        System.out.println(Arrays.toString(countBits(n)));
    }
    public static int[] countBits(int n) {
        //Q-338
        int[] ans = new int[n+1];
        for (int i = 0; i <= n ; i++) {
            int setBits = setBits(i);
            ans[i] = setBits;
        }
        return ans;
    }
    public static int setBits(int n){
        int setBits = 0;
        while (n>0){
            if ((n&1)==1) setBits++;
            n = n>>1;
        }
        return setBits;
    }
}
