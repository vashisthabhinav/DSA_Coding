package DSA.Algorithms.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;

public class S_02_FirstNegativeSubArray {
    public static void main(String[] args) {
        long[] nums = {-8, 2, 3, -6, 10};
        System.out.println(Arrays.toString(printFirstNegativeInteger(nums,5,2)));
    }
    public static long[] printFirstNegativeInteger(long A[], int N, int K){
        long[] ans = new long[A.length-K+1];;
        ArrayList<Long> negatives = new ArrayList<>();

        int i = 0 , j = 0;
        while(j<N){
            if (A[j] < 0){
                negatives.add(A[j]);
            }
            if(j-i+1<K){
                j++;
            }
            else{
                if (negatives.size()==0){
                    ans[i] = 0;
                }
                else{
                    ans[i] = negatives.get(0);
                }
                if (negatives.size()!=0 &&  A[i] == negatives.get(0)){
                    negatives.remove(0);
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
