package DSA.Math;

import java.util.Arrays;

public class B_12_LargestPerimeterTriangle {
    public static void main(String[] args) {
        int [] nums = {3,2,3,4};
        System.out.println(largestPerimeter(nums));
    }
    public static int largestPerimeter(int[] nums) {
        //For a triangle to be of non-zero area, sum of lengths of two sides should be greater than the third side
        //First sorting the array to get the side length\
        int perimeter = 0;
        Arrays.sort(nums);
        for (int i = 0; i <=nums.length-3;  i++) {
            if (nums[i] + nums[i+1] > nums[i+2]){
                int sum = nums[i] + nums[i+1] + nums[i+2];
                perimeter = Math.max(sum,perimeter);
            }
        }
        return perimeter;
    }
}
