package Beginner.Arrays;

import java.util.Arrays;

public class AR_03_SquaresOfSortedArrayMethod2 {
    public static int[] sortedSquares(int[] nums) {
        // Squaring each element and sorting the new array is very trivial.
        // So, to make the run time faster, using a different approach.
        int[] arr = new int[nums.length];
        /* Making a new array equal to the length of the previous one.
        The new array will have only zeros initially.
         */

        int l = 0;
        int r = nums.length - 1;// Assigning r
        int i = nums.length - 1;// Assigning i

        while (l <= r) {
            // Traversing the new array.
            if (nums[l] * nums[l] > nums[r] * nums[r]) {
                // If square of value at l position (l will keep on increasing till the statement is met) > square of value at r position
                arr[i] = nums[l] * nums[l];
                // Filling the new array at i position by square of nums[l]
                l++;// Incrementing l
            } else {
                // If the above statement is not met i.e., square of nums[r] > square of nums[l]
                arr[i] = nums[r] * nums[r];
                // Filling the new array at i position by square of nums[r]
                r--;// Decrementing r
            }
            i--;// Decrementing i
        }
        arr[0] = nums[l] * nums[l];

        return arr;
    }
    /*
    Initially nums = {-7,-3,2,3,11}; arr = {0,0,0,0,0,};
    l = 0; i = 4; r = 4;
    Inside if-else --> l = 0; i = 4; r = 4;
    nums[l]^2 = 49 < nums[r]^2 = 121 --> else statement executed --> arr = {0,0,0,0,121}; r=3;
    Exiting if-else and decrementing i --> i = 3;

    Next - l = 0; r=3; i=3; entering while loop
    nums[l]^2 = 49 > nums[r]^2 = 9 --> if statement executed --> arr = {0,0,0,49,121};(49 added to index 3 i.e., i) r=3; l=1;
    Exiting if-else and decrementing i --> i = 2;

    Next - l = 1; r=3; i=2; entering while loop
    nums[l]^2 = 9 == nums[r]^2 = 9 --> else statement executed  as if statement is false --> arr = {0,0,9,49,121}; r=2;
    Exiting if-else and decrementing i --> i = 1;

    Next - l = 1; r=2; i=1; entering while loop
    nums[l]^2 = 9 > nums[r]^2 = 4 --> if statement executed --> arr = {0,9,9,49,121};(9 added to index 1 i.e., i) r=2; l=2;
    Exiting if-else and decrementing i --> i = 0;

    Next - l = 2; r=2; i=0; entering while loop
    nums[l]^2 = 4 == nums[r]^2 = 4 --> else statement executed  as if statement is false --> arr = {4,9,9,49,121}; r=1;
    Exiting if-else and decrementing i --> i = -1;

    Next - l = 2; r=1; i=-1; exiting while loop as l!<=r
    arr[0] = nums[l] * nums[l]; i.e., arr = {4,9,9,49,121}; l=2;

    Returning new array formed
     */
    public static void main(String[] args) {
        int [] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
