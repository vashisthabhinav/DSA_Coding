package Bootcamp.Sorting;

import java.util.ArrayList;
import java.util.List;

public class B_11_NumbersDisappeared {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        //Q448
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;//Correct index of the element (value - 1)

            if (nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> missingNumbers = new ArrayList<>();
        //Search for disappeared numbers
        for (int j = 0; j < nums.length ; j++) {
            if (nums[j] != (j+1)){
                missingNumbers.add(j+1);
            }
        }
        return missingNumbers;
    }

    public static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}