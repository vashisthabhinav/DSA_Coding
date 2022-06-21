package DSA.Arrays;

import java.util.Arrays;

public class K_08_MoveZeros {
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(nums));
        moveZeroes1(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        //Using extra array
        int[] ans = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                ans[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < nums.length; i++) {
            ans[i] = 0;
        }
        //Now copping the ans array into the nums array
        for (int i = 0; i < ans.length; i++) {
            nums[i] = ans[i];
        }
    }
    public static void moveZeroes1(int[] nums) {
        //Without extra array
        int nonZeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroCount++] = nums[i];
            }
        }
        for (int i = nonZeroCount; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
