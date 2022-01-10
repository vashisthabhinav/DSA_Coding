package Beginner.Easy;

import java.util.Arrays;

public class LC_02_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            // Traversing through the array.
            for (int j = i + 1; j < nums.length; j++) {
                // Looking at the next consecutive number of the array.
                if (nums[i] + nums[j] == target) {
                    // Checking whether the sum of the consecutive numbers is equal to the given target.
                    return new int[] { i, j };
                    // If they are the required pair of indices then returning them.
                }
            }
        }
        return new int[] {};
        // Returning to the main method
    }

    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums,9)));
    }
}
