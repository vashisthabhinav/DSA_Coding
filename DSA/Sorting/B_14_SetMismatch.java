package DSA.Sorting;

import java.util.Arrays;

public class B_14_SetMismatch {
    public static void main(String[] args) {
        int [] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    public static int[] findErrorNums(int[] nums) {
        //Q645
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;//Correct index of the element (value - 1)
            if (nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j < nums.length ; j++) {
            if (nums[j] != j+1){
                return new int[] {nums[j],j+1};
            }
        }
        return new int[]{};
    }
    public static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
