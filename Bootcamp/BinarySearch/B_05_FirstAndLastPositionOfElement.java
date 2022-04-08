package Bootcamp.BinarySearch;

import java.util.Arrays;

public class B_05_FirstAndLastPositionOfElement {
    static int[] searchRange(int[] nums, int target) {
        //Two separate binary search method
        int firstOccurrence  = firstOccurrence(nums,target);
        int lastOccurrence = lastOccurrence(nums,target);
        int[] newArr = {firstOccurrence,lastOccurrence};
        return newArr;
    }

    static int firstOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int firstOccurrence = -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target<arr[mid]) end = mid-1;
            else if (target>arr[mid]) start = mid+1;
            else {
                firstOccurrence = mid;
                end = mid-1;
            }
        }
        return firstOccurrence;
    }

    static int lastOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int lastOccurrence = -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if ( target<arr[mid]) end = mid-1;
            else if (target>arr[mid]) start = mid+1;
            else {
                lastOccurrence = mid;
                end = start = mid+1;
            }
        }
        return lastOccurrence;
    }
    public static void main(String[] args) {
        int [] arr = {1};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr,target)));
        System.out.println(Arrays.toString(searchRange1(arr,target)));
    }
    static int[] searchRange1(int[] nums, int target) {
        //One common binary search method
        int firstOccurrence  = Occurrence(nums,target, true);
        int lastOccurrence = Occurrence(nums,target,false);
        int[] newArr = {firstOccurrence,lastOccurrence};
        return newArr;
    }

    static int Occurrence(int[] arr, int target, boolean index) {
        int start = 0;
        int end = arr.length-1;
        int occurrence = -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target<arr[mid]) end = mid-1;
            else if (target>arr[mid]) start = mid+1;
            else {
                occurrence = mid;
               if (index){
                   end = mid-1;
               }
               else {
                   end = start = mid+1;
               }
            }
        }
        return occurrence;
    }
}
