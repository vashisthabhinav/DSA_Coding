package DSA.Arrays;

import java.util.Arrays;

public class K_22_MaxNumOfPairs {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1,3,2,2};
        System.out.println(Arrays.toString(numberOfPairs(nums)));
    }
    public static int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        int pairs = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i]==nums[i - 1]){
                nums[i] = -1;
                nums[i - 1] = -1;
                pairs++;
            }
        }
        return new int[] {pairs , nums.length - (2* pairs)};
    }
}
