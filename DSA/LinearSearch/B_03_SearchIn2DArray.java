package DSA.LinearSearch;

import java.util.Arrays;

public class B_03_SearchIn2DArray {
    public static void main(String[] args) {
        int [] [] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,129}
        };
        int target = 34;
        System.out.println(Arrays.toString(Search2D(arr,target)));
        System.out.println(findMax(arr,target));
    }

    public static int findMax(int[][] arr, int target) {
        int max = Integer.MIN_VALUE;
        if (arr.length==0) return max;
        for (int row = 0; row <arr.length ; row++) {
            for (int column = 0; column <arr[row].length ; column++) {
                if (max < arr[row][column]){
                    max = arr[row][column];
                }
            }
        }

        return max;
    }

    static int [] Search2D(int[][] arr, int target) {
        if (arr.length==0) return new int[] {-1,-1};
         for (int row = 0; row <arr.length ; row++) {
             for (int column = 0; column <arr[row].length ; column++) {
                 if (arr[row][column]==target){
                    return new int[] {row,column};
                 }
             }             
         }
         return new int[] {-1,-1};
    }
}
