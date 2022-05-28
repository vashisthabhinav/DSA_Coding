package Bootcamp.BinarySearch;

public class B_08_01_SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        /*
        In 4,5,6,7,0,1,2
        It is ascending, from 4-7 & 0-2, and descending only from 7-0
        7 is the pivot.
        i.e., pivot is when mid>mid+1 or mid<mid-1
         */
        int start = 0, end = nums.length-1;
        int pivotIndex = -1;
        int targetIndex;
        while(start<=end){
            int mid = start + (end-start)/2;
            if (mid<end && nums[mid]>nums[mid+1]){
                // if the mid is the end element in one case, then mid+1 will give ArrayOutOfBoundsException
                // Thus mid<end
                pivotIndex = mid;
            }
            if (mid>start && nums[mid]<nums[mid-1]) {
                // if the mid is the start element in one case, then mid-1 will give ArrayOutOfBoundsException
                // Thus mid>start
                pivotIndex = mid-1;
            }
            if (nums[start]>=nums[mid]) {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
       if (pivotIndex==-1){
           //Normal Binary Search as the array is not rotated
           targetIndex = binarySearch(nums,0,nums.length-1,target);
       }else{
             //Checking in the first half
           targetIndex = binarySearch(nums,0, pivotIndex, target);
           if (targetIndex==-1){
               targetIndex = binarySearch(nums,pivotIndex+1,nums.length-1, target);
           }
       }
        return targetIndex;
    }
    public static int binarySearch(int[] arr,int start, int end, int target){
        if (arr.length==0) return -1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if (target<arr[mid]) end = mid-1;
            else if (target>arr[mid]) start = mid+1;
            else return mid;//ans
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2,3};
        int target  = 3;
        System.out.println(search(arr,target));
    }
}
