package Bootcamp.BinarySearch;

import java.util.Arrays;

public class B_05_FirstAndLastPositionOfElement {
    //    Q-34 LeetCode
/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].
*/
    static int[] searchRange(int[] nums, int target) {
        //Two separate binary search method
        int firstOccurrence = firstOccurrence(nums, target);
        int lastOccurrence = lastOccurrence(nums, target);
        int[] newArr = {firstOccurrence, lastOccurrence};
        return newArr;
    }

    static int firstOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int firstOccurrence = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {//the target is equal to mid
//                Here, we have found one possible ans, that firstOccurrence = mid,
//                Now for the firstOccurrence, it is possible that more element equal to the target element lies in the left-hand side of the mid.
//                So, we are checking for this case
                firstOccurrence = mid;
                end = mid - 1;
            }
        }
        return firstOccurrence;
    }

    static int lastOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int lastOccurrence = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {//the target is equal to mid
//                Here, we have found one possible ans, that lastOccurrence = mid,
//                Now for the lastOccurrence, it is possible that more element equal to the target element lies in the right-hand side of the mid.
//                So, we are checking for this case
                lastOccurrence = mid;
                end = start = mid + 1;
            }
        }
        return lastOccurrence;
    }

    public static void main(String[] args) {
//        int [] arr = {1,3,4,5,6,7,8,8,8,9,9};
        int[] arr = {1};
        int target = 1;
//        System.out.println(Arrays.toString(searchRange(arr,target))); Not a potential answer as it is valid only in certain cases.
        System.out.println(Arrays.toString(searchRange1(arr, target)));
    }

    static int[] searchRange1(int[] nums, int target) {
        //One common binary search method
        int[] newArr = {-1, -1};
        int firstOccurrence = Occurrence(nums, target, true);
        int lastOccurrence = Occurrence(nums, target, false);
        newArr[0] = firstOccurrence;
        newArr[1] = lastOccurrence;
        return newArr;
    }

    static int Occurrence(int[] arr, int target, boolean index) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //Here, we are using only one method that runs two times and gives the firstOccurrence and the lastOccurrence
                ans = mid;;//One possible answer has been found. Now, looking for the firstOccurrence in the left part of the array and last occurrence in the right part of the array.
                if (index) {
                    // For the first occurrence, checking in the left part of the array, so end is changed
                    end = mid - 1;
                } else {
                    // For the last occurrence, checking in the right part of the array, so start is changed
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
