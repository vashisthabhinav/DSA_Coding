package Bootcamp.Arrays;

public class K_09_OddLengthSubarrays {
    public static void main(String[] args) {
        int [] nums = {10,11,12};
        System.out.println(sumOddLengthSubarrays(nums));
        System.out.println(sumOddLengthSubarrays1(nums));
    }
    public static int sumOddLengthSubarrays(int[] nums) {
        //Q1588
        //Brute Force Approach
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                //Trying for every (i,j) pair
                if ((j - i) % 2 == 0) {//If the length is odd, ex for length of 3, max index = 2 and minimum = 0
                    //So, checking if j-i is even, then the sub-array will be of odd length
                    for (int k = i; k <= j; k++) {
                        sum += nums[k];
                    }
                }
            }
        }
        return sum;
    }
    public static int sumOddLengthSubarrays1(int[] nums) {
        //Q1588
        /*
        Consider the sub-array that contains A[i],
        we can take 0,1,2..,i elements on the left,
        from A[0] to A[i],
        we have i + 1 choices.

        we can take 0,1,2..,n-1-i elements on the right,
        from A[i] to A[n-1],
        we have n - i choices.

        In total, there are k = (i + 1) * (n - i) sub-arrays, that contains A[i].
        And there are (k + 1) / 2 sub-arrays with odd length, that contains A[i].
        And there are k / 2 sub-arrays with even length, that contains A[i].

        A[i] will be counted ((i + 1) * (n - i) + 1) / 2 times for our question.

        Example of array [1,2,3,4,5]
        1 2 3 4 5 sub-array length 1
        1 2 X X X sub-array length 2
        X 2 3 X X sub-array length 2
        X X 3 4 X sub-array length 2
        X X X 4 5 sub-array length 2
        1 2 3 X X sub-array length 3
        X 2 3 4 X sub-array length 3
        X X 3 4 5 sub-array length 3
        1 2 3 4 X sub-array length 4
        X 2 3 4 5 sub-array length 4
        1 2 3 4 5 sub-array length 5

        5 8 9 8 5 total times each index was added, k = (i + 1) * (n - i)
        3 4 5 4 3 total times in odd length array with (k + 1) / 2
        2 4 4 4 2 total times in even length array with k / 2s
         */

        int sum = 0, n = nums.length;
        for (int i = 0; i < n; ++i) {
            int k = (i+1) * (n-i);
            int oddElement = (k + 1)/2;
            int value = oddElement*nums[i];
            sum += value;
        }
        return sum;
    }
}
