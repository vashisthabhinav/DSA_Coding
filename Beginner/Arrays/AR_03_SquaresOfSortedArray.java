package Beginner.Arrays;

import java.util.Arrays;

public class AR_03_SquaresOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {
            //Traversing through the array
            nums[i] = nums[i]*nums[i];
            // Squaring the array
        }
//        quickSort(nums, 0, nums.length);
        /*
        One issue with the quick sort when running with LeetCode website is that we cannot create another static method inside the method already given in the code. So, we have to use a simple sorting algorithm that is used inside the same method as given.
         */

        // Bubble sort

        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < nums.length-i-1 ; j++) {
                if (nums[j+1]<nums[j]){
                    //swap(nums,j,j+1); Swap also has to be inside the same method. So swapping here itself-
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }

        }

        input[j] = pivot;
        return j;

    }

    public static void main(String[] args) {
        int [] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
