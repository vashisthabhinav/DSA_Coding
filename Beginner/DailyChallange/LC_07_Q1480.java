package Beginner.DailyChallange;

import java.util.Arrays;

public class LC_07_Q1480 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];//Initializing the array
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];//Taking the sum of all the previous elements present in the array
            runningSum[i] = sum;//Adding the sum at the index i
        }
        return runningSum;
    }
}
