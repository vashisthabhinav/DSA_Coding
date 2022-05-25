package Bootcamp.BinarySearch;

public class B_08_SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        /*
        In 4,5,6,7,0,1,2
        It is ascending, from 4-7 & 0-2, and descending only from 7-0
        7 is the pivot.
        i.e., pivot is when mid>mid+1 or mid<mid-1
         */
        int start = 0, end = nums.length-1;
        int index = -1;
//        while(start<)
        return index;
    }

    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int target  = 3;
        System.out.println(search(arr,target));
    }
}
