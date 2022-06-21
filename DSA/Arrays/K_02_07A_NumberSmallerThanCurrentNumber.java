package DSA.Arrays;

import java.util.Arrays;

public class K_02_07A_NumberSmallerThanCurrentNumber {
    
    /*
    Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
    That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
    Return the answer in an array.
     */
    
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] result =  new int[nums.length];

        for (int i = 0; i < nums.length ; i++) {
            int smallerNums = 0;
            for (int j = 0; j < nums.length ; j++) {
                if (j!=i && nums[j]<nums[i]){
                    smallerNums++;
                }
            }
            result[i] = smallerNums;
        }

        return result;
    }
    public static void main(String[] args) {
        int [] nums = {7,7,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
