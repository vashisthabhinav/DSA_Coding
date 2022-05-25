package Bootcamp.BinarySearch;

public class B_07_SearchInMountain {// Code for checking the solution on an ide
//    Q-1095 leetCode
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,3,1};
        int peakIndex = peakIndexInMountainArray(arr);
        int target = 3;
        int indexOfTarget = binarySearch(arr,0,peakIndex,target);
        if (indexOfTarget == -1){
            indexOfTarget = binarySearch(arr,peakIndex,arr.length-1,target);
        }
        System.out.println(indexOfTarget);
    }
    //    Q852 LeetCode
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if (arr[mid]>arr[mid+1]){
                /*
                This is the decreasing part of the array. This may be the ans, but looking at the left. That's why, end != mid-1
                 */
                end = mid;
            }
            else{
                // This is the ascending part of the array.
                start = mid+1;//Because we know that mid+1 elements > mid element, because the above if statement is false
            }
        }
        /*
        In the end, start == end and pointing to the largest number because of the two checks above.
        Start and end are always trying to find max element in the above 2 checks.
        Hence, when they are pointing to just one element, that is the max one because that is what the checks say.
        More elaboration: At every point of time for start and end, they have the best possible answer till that time.
        And if we are saying that only one item is remaining, coz of the above line that is the best possible answer
         */
        return start; //or return end as both are same
    }
    static int binarySearch(int[] arr,int start, int end, int target){// Order agnostic binary search
        if (arr.length==0) return -1;
//        int start = 0;
//        int end = arr.length-1;

        // Find whether the array is sorted in ascending order or descending order
        boolean isAsc = arr[start]<arr[end];
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid]==target)return mid;//ans
            if (isAsc){
                if (target<arr[mid]) end = mid-1;
                else if (target>arr[mid]) start = mid+1;
            }else {
                if (target<arr[mid]) start = mid+1;
                else if (target>arr[mid]) end = mid-1;
            }
        }
        return -1;
    }
}
// Now code that is to be submitted in the LeetCode using the MountainArray interface

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */


/*
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int i = 0;
        int j = mountainArr.length()-1 ;// Finding the last element
        int peakIndex = 0 ;

        //Finding peak value's index
        while (i < j) {
            int mid = (i+j) / 2 ;
            int x = mountainArr.get(mid) ;
            int y = mountainArr.get(mid+1) ;
            int z = mountainArr.get(mid-1) ;


            if (x > y && x > z) {
                peakIndex = mid ;
                break ;
            }
            else if (x > z) {
                i = mid+1 ;
            }
            else if (x < z) {
                j = mid ;
            }
        }

        i = 0 ;
        j = peakIndex ;

        //Searching at left of peak (using binary search algorithm)
        while (i <= j) {
            int mid = (i+j) / 2 ;
            int x = mountainArr.get(mid) ;

            if (x == target) {
                return mid ;
            }
            else if (x < target) {
                i = mid+1 ;
            }
            else if (x > target) {
                j = mid-1 ;
            }
        }

        i = peakIndex+1 ;
        j = mountainArr.length()-1 ;

        //Searching at right of peak (using Binary search algorithm)
        while (i <= j) {
            int mid = (i+j) / 2 ;
            int x = mountainArr.get(mid) ;

            if (x == target) {
                return mid ;
            }
            else if (x > target) {
                i = mid+1 ;
            }
            else if (x < target) {
                j = mid-1 ;
            }
        }

        return -1 ;
    }
}
 */