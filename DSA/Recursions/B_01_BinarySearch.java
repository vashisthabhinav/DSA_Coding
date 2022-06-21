package DSA.Recursions;

public class B_01_BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8,9};
        int start = 0 , end = nums.length-1 , target = 3;
        System.out.println(binarySearch(nums,start,end,target));
    }
    public static int binarySearch(int[]nums, int start, int end, int target){
        if (start>end) {
            return -1;
        }
        int mid = start + (end - start)/2;
        if (nums[mid]==target){
            return mid;
        }
        if (nums[mid]>target){
            return binarySearch(nums,start,mid-1,target);
        }else {
            return binarySearch(nums,mid+1,end,target);
        }
    }
}
