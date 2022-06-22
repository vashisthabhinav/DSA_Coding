package DSA.Arrays;

import java.util.Arrays;

public class K_14_KthLargestElementInArray {
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 1;
        System.out.println(findKthLargest(nums,k));
    }
    public static int findKthLargest(int[] nums, int k) {
        int ans = 0;
        Arrays.sort(nums);
        ans = nums[nums.length-k];
        return ans;
    }
}
