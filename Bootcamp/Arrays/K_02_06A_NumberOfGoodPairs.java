package Bootcamp.Arrays;

import java.util.Arrays;

public class K_02_06A_NumberOfGoodPairs {
    /*
    Given an array of integers nums, return the number of good pairs.
    A pair (i, j) is called good if nums[i] == nums[j] and i < j.
     */
    public static int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;

        for (int i = 0; i <nums.length ; i++) {//Traversing the array and checking for each index
            int j = nums.length-1;
            while (i<j){//Condition which has to be satisfied
                if (nums[i]==nums[j--]){//Good pairs condition
                    goodPairs++;
                }
            }
        }

        return goodPairs;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,1,1};
        System.out.println((numIdenticalPairs(nums)));
        System.out.println((numIdenticalPairs1(nums)));
    }
    public static int numIdenticalPairs1(int[] nums) {//Less effective but easy to understand
        int goodPairs = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j<nums.length;j++){
                if(i<j && nums[i]==nums[j]){
                    goodPairs++;
                }
            }
        }
        return goodPairs;
    }
}
