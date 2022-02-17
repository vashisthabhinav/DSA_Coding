package Bootcamp;

import java.util.Arrays;

public class K_02_03A_RunningSum {
    public static int[] runningSum(int[] nums) {
        /*
        Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
        Return the running sum of nums.
         */
        int [] runningSum = new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            //j will take all the values of i and its preceding indices until it reaches -1 and add ot to the runningSum
            int j = i;
            while (j>=0){
                runningSum[i] +=nums[j];
                j--;
            }
        }
        return runningSum;
    }



    public static void main(String[] args) {
        int [] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
