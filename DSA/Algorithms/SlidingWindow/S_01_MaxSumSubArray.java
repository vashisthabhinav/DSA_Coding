package DSA.Algorithms.SlidingWindow;

import java.util.ArrayList;

public class S_01_MaxSumSubArray {
    public static void main(String[] args) {
        ArrayList<Integer> Arr = new ArrayList<>();
        Arr.add(100);
        Arr.add(200);
        Arr.add(300);
        Arr.add(400);
        System.out.println(maximumSumSubarray(2,Arr,4));
    }
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N){
        int i = 0 , j = 0 ;
        long sum = 0, max = Integer.MIN_VALUE;
        while(j<N){
            sum += Arr.get(j);
            if (j-i+1<K){
                j++;
            }else{
                max = Math.max(sum,max);
                sum -= Arr.get(i);
                i++;
                j++;
            }

        }
        return max;
    }
}
