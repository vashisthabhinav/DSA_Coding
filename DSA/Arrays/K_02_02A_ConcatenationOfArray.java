package DSA.Arrays;

import java.util.Arrays;

public class K_02_02A_ConcatenationOfArray {
    /*
    Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
    Specifically, ans is the concatenation of two nums arrays.
    Return the array ans.
     */
    public static int[] getConcatenation(int[] nums) {
        int [] ans = new int[2*nums.length];
        int n= nums.length;
        for (int i = 0; i <nums.length ; i++) {
            ans[i] = nums[i];
        }
        for (int i = 0; i <nums.length ; i++) {
            ans[i+n] = nums[i];
        }

        return ans;
    }
    public static void main(String[] args) {

        int [] nums = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
