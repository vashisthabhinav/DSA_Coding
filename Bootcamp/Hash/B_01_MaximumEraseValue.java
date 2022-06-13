package Bootcamp.Hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class B_01_MaximumEraseValue {
    //Q1695 Arrays and Hashset with two pointer technique
    public static void main(String[] args) {
        int[] nums = {5,2,1,2,5,2,1,2,5};
        System.out.println(maximumUniqueSubarray(nums));
        System.out.println(maximumUniqueSubarray1(nums));
        System.out.println(maximumUniqueSubarray2(nums));
    }
    public static int maximumUniqueSubarray(int[] nums) {
        //Naive approach, won't work for large inputs.
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i <nums.length ; i++) {
            integers.add(nums[i]);
        }
        List<Integer> integer = new ArrayList<>(integers);
        int sum = 0;
        for (int i = 0; i <integer.size() ; i++) {
            sum += integer.get(i);
        }
        return sum;
    }
    public static int maximumUniqueSubarray1(int[] nums) {
        //Time limit exceeds for big arrays
        int maxSum = 0;
        for(int i = 0; i < nums.length; i++){
            int tempSum = 0;//temporary sum for this iteration
            HashSet<Integer> set = new HashSet<>();
            for(int j = i; j < nums.length; j++){
                if(!set.contains(nums[j])){
                    //If nums[j] is not in the has set
                    tempSum += nums[j] ;//Then adding it into the tempSum
                    maxSum = Math.max(maxSum, tempSum);//Returning the maximum score for this iteration
                    set.add(nums[j]);//Adding j into the set
                } else break;//else the element is already present in the hash set, and we need the sum of only unique elements
            }
        }
        return maxSum;
    }

    public static int maximumUniqueSubarray2(int[] nums) {
        int maxScore = 0, currScore = 0;
        Set<Integer> set = new HashSet<>();
        for (int l=0, r=0; r<nums.length; r++) {
            while (!set.add(nums[r])) {
                currScore -= nums[l];
                set.remove(nums[l++]);
            }
            currScore += nums[r];
            maxScore = Math.max(maxScore, currScore);
        }
        return maxScore;
    }
}
