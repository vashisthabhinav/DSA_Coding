package DSA.BinarySearch;

import java.util.Arrays;

public class B_20_SpecialArray {
    public static void main(String[] args) {
        int[] nums = {0,4,3,0,4};
        System.out.println(specialArray(nums));
    }
    public static int specialArray(int[] nums) {
        //Q1608
        Arrays.sort(nums);
        int start = 0 , end = nums.length;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (mid == greaterOrEqualTo(nums,mid)){
                return mid;
            }else if (mid<greaterOrEqualTo(nums,mid)){
                start = mid +1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static int greaterOrEqualTo(int[] nums, int mid){
        int count = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]>=mid) count++;
        }
        return count;
    }

}
