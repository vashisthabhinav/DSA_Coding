package Bootcamp.Arrays;

import java.util.Arrays;

public class K_03_01ARotateArray_GoodQuestion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate1(arr,3);
    }
    public static void rotate(int[] nums, int k) {
        //Q189

        //Brute Force Approach
        //Make a new array and add the numbers according to it

        if (nums.length==1) return;
        k = k% nums.length;
        int[] arr = new int[nums.length];
        for (int i = 0; i <k ; i++) {
            arr[i] = nums[nums.length-(k-i)];
        }
        int index = 0;
        for (int i = k; i < arr.length ; i++) {
            arr[i] = nums[index];
            index++;
        }
        for (int i = 0; i < nums.length ; i++) {
            nums[i] = arr[i];
        }
        System.out.println(Arrays.toString(nums));
    }
        public static void rotate1(int[] nums, int k) {
//        Marks the correct index of a number
            int correctIndex = 0;
//        Marks the index of the array.
            int i = 0;
//        Marks the number of iterations in the array.
            int iterations = 0;
            while(iterations < nums.length){
                if((correctIndex+k)% nums.length == i){
                    i++;
                    correctIndex = i;
                    iterations++;
                }else{
                    swap(nums,i,(correctIndex+k)%nums.length);
                    correctIndex = (correctIndex+k)%nums.length;
                    iterations++;
                }
            }
        }
    public static void swap(int [] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
