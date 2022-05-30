package Bootcamp.BinarySearch;

public class B_16_IntersectionOf2Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1} , nums2 = {2,2};
    }

    public int[] intersection(int[] nums1, int[] nums2) {

        for (int i = 0; i <nums1.length ; i++) {
             binarySearch(nums2,nums1[i]);
        }
        return new int[]{};
    }
    public static int binarySearch(int[] arr,int target){
        if (arr.length==0) return -1;
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if (target<arr[mid]) end = mid-1;
            else if (target>arr[mid]) start = mid+1;
            else return mid;//ans
        }
        return -1;
    }
}
