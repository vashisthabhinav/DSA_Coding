package Bootcamp.BinarySearch;

public class B_11_SearchInsertPosition {
    // Q35 LeetCode
    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0, index = -1, end = nums.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (nums[mid]==target){
                index = mid;
                break;
            }else if (nums[mid]>target){
                end = mid-1;
            }else {
                start = mid + 1;
            }
        }
        if (index==-1){
            index = start;//If the target is not present in the loop that it should be at the position of start (or end+1 or mid+1)
            //Because in the final iteration, start, end and middle are in the same index and the target is greater than that position.
        }
        return index;
    }
}
