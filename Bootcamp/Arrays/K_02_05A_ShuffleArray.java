package Bootcamp.Arrays;

import java.util.Arrays;

public class K_02_05A_ShuffleArray {
    /*
    Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
    Return the array in the form [x1,y1,x2,y2,...,xn,yn].
     */

    public static int[] shuffle(int[] nums, int n) {
        int [] newArray = new int[nums.length];
        for (int i = 0; i <n ; i++) {
            newArray[2*i] = nums[i]; //Adding x1,x2..xn at indices- 0,2,4...
        }
        int j = 1;
        for (int i = n; i < nums.length ; i++) {//Adding y1,y2..yn at indices- 1,3,5...
            newArray[j] = nums[i];
            j = j+2;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(nums,4)));
    }
}
