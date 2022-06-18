package Bootcamp.BinarySearch;

import java.util.Arrays;

public class B_21_K_WeakestRowsR {
    public static void main(String[] args) {
        int[][] mat =
                {
                        {1,1,0,0,0},
                        {1,1,1,1,0},
                        {1,0,0,0,0},
                        {1,1,0,0,0},
                        {1,1,1,1,1}
                };
        int k = 3;
        System.out.println(Arrays.toString(kWeakestRows(mat,k)));
    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        int [] record = new int[mat.length];
//        We will find out the last index of 1 in every row.
        for (int i = 0; i < record.length; i++) {
            record[i] = binarySearch(mat[i]);
        }
        int [] ans = new int[k];
        int m = 0;
        for (int i = 0; i < record.length; i++) {
            int min = Integer.MAX_VALUE;
            int savedIndex = -1;
            for (int j = 0; j < record.length; j++) {
//                As if no 0s are there record[j] is -1. So if we want to mark presence of a row in the ans array,
//                we will mark it as -2.
                if(min > record[j] && record[j] != -2){
                    min = record[j];
                    savedIndex = j;
                }
            }
            if(min != Integer.MAX_VALUE){
                ans[m++] = savedIndex;
                record[savedIndex] = -2;
            }
            if(m == k){
                break;
            }
        }
        return ans;
    }
    static int binarySearch(int [] nums){
        int start = 0;
//        Row length
        int end = nums.length -1;
        int ans = -1;
        while(start <= end){
            int mid = end + (start-end)/2;
            if(nums[mid] == 1){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
}