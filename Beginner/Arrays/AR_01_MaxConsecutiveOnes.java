package Beginner.Arrays;

public class AR_01_MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            //Traversing through the array
            int localMaxConsecutiveOnes = 0;
            /*
            A separate variable is necessary inside the array because-
            If we use maxConsecutiveOnes inside the loop, then explaining by example-
            {1,0,1,1,1,0,1,1}
            In the above array, the answer should be 3 but will come 2 as-
            When the array will be traversed from left to right, initially maxConsecutiveOnes will change to 3 at index 4.
            But it will be reassigned number 2 when it will reach the last index.
            So to avoid this, a separate local variable is required, which will be used inside the while loop.
             */
            while(i< nums.length && nums[i] == 1 ){//Adding i < nums.length is necessary to remove Index Out of Bounds Exception
                 localMaxConsecutiveOnes= 1; //If the loop is entered, maxConsecutiveOnes is at least 1 as 1 has occurred at least one time here.
                while(i+1 < nums.length && nums[i+1] == 1) {//Adding i+1< nums.length is necessary to remove Index Out of Bounds Exception
                    localMaxConsecutiveOnes++; // Increasing the maximum consecutive ones no of times the loop is run.
                    i++;
                }
                if(maxConsecutiveOnes <localMaxConsecutiveOnes ){
                    maxConsecutiveOnes = localMaxConsecutiveOnes;
                }
                i++;
            }
        }

        return maxConsecutiveOnes;
    }

    public static void main(String[] args) {
        int nums[] = { 1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
