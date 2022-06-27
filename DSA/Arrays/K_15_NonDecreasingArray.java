package DSA.Arrays;

public class K_15_NonDecreasingArray {
    public static void main(String[] args) {
        int[] nums = {4,2,3};
        System.out.println(checkPossibility(nums));
    }

    public static boolean checkPossibility(int[] nums) {
        int count = 0;
        //We can edit atmost 1 value, so break the loop if the count exceeds 1.
        for (int i = 1; i < nums.length && count <= 1; i++) {
            //Checking prev value with curr value
            if (nums[i - 1] > nums[i]) {
                count++;
                //checking the second prev value from curr value.
                if (i - 2 < 0 || nums[i - 2] <= nums[i])
                    nums[i - 1] = nums[i];    //If prev value is > current val, change the prev value.
                else
                    nums[i] = nums[i - 1];    //If last 2 values both are > current, change the current value.
            }
        }
        return count <= 1;
    }
}