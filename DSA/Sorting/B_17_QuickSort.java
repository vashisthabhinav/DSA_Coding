package DSA.Sorting;

import java.util.Arrays;

public class B_17_QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,2,1,3};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] nums,int low, int high ){
        if (low>=high) return;
        int start = low;
        int end = high;
        int mid = start + (end-start)/2;
        int pivot = nums[mid];
        while (start<=end){
            while (nums[start]<pivot) start++;
            while (nums[end]>pivot) end--;
            if (start<=end){
                //Also a reason why if its already sorted, it will not swap
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        //Now the pivot is at correct index, so sorting the LHS and RHS
        quickSort(nums,low,end);
        quickSort(nums,start,high);
    }
}
