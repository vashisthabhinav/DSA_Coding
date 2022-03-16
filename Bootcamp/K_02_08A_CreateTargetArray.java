package Bootcamp;

import java.util.Arrays;

public class K_02_08A_CreateTargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int [] target = new int[nums.length];
        for (int i = 0; i < index.length; i++) {
            target[index[i]] = nums[i];
        }

        return target;
    }
    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4};
        int [] index = {0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
}
