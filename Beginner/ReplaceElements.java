package Beginner;

import java.util.Arrays;

public class ReplaceElements {
    public static void main(String[] args) {
        int[] nums = {1,2,4,6};
        int [][] operations = {{1,3},{4,7},{6,1}};
        int[] nums1 = {1,2};
        int [][] operations1 = {{1,3},{2,1},{3,2}};
        System.out.println(Arrays.toString(arrayChange(nums,operations)));
        System.out.println(Arrays.toString(arrayChange(nums1,operations1)));
    }
    public static int[] arrayChange(int[] nums, int[][] operations) {
        //Brute Force Approach
        int n = nums.length;
        int m = operations.length;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <operations[i].length ; j++) {
                int numsIndex = search(nums,operations[i][0]);
                if (numsIndex>=0){
                    nums[numsIndex] = operations[i][1];
                }
            }
        }
        return nums;
    }
    public static int search(int[] nums,int target){
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]==target) return i;
        }
        return -1;
    }
}
