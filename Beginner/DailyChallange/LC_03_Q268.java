package Beginner.DailyChallange;

public class LC_03_Q268 {
    public static void main(String[] args) {
        int [] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int missingNum = 0;
        //The range is from 0 to n, so the last number will be equal to the length of array
        int lastNum = nums.length;
        int sum = 0;
        // We are taking sum here because sum of 0 to n terms is [n*(n+1)]/2 and we will get totalSum - the sum of our array.
        // So from here, we can find the missing number = totalSum - sum of our array
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int totalSum = (lastNum*(lastNum+1))/2;
        missingNum = totalSum - sum;
        return missingNum;
    }
}
