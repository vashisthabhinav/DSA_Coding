package DSA.BinarySearch;

import java.util.Arrays;

public class B_17_TwoSum2 {
    public static void main(String[] args) {
        int [] numbers = {2,7,11,15};
        int target = 26;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
        System.out.println(Arrays.toString(twoSum1(numbers,target)));
        System.out.println(Arrays.toString(twoSum2(numbers,target)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        //Q167
        //Brute Force Approach O(n^2) Time Complexity
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                if (numbers[i] + numbers[j] == target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] twoSum1(int[] numbers, int target) {
        //Q167
        //We know that there is only one solution in the entire array and the array is sorted
        // So, we can simply check the first element and the last element for the sum
        //If the sum is larger than the target, we can instead check for the 2nd last element
        //If the sum is smaller than the target, we can instead check for the 2nd element
        //This will keep on iterating until we reach the target and the required ans
        int firstIndex = 0, lastIndex = numbers.length-1;
        while (firstIndex<lastIndex){
            int sum = numbers[firstIndex] + numbers[lastIndex];
            if (sum==target){
                //We have found the answer
                return new int[]{firstIndex+1 , lastIndex+1};//As the array is 1-indexed array
            }else if (sum>target){
                //Sum is greater than the target so, decrease the lastIndex to get a smaller number
                lastIndex--;
            }else{
                //Sum is smaller than the target so, increase the firstIndex to get a larger number
                firstIndex++;
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] == target - nums[i]) {
                    return new int[]{i + 1, mid + 1};
                } else if (nums[mid] > target - nums[i]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return new int[]{-1, -1};
    }
}
