package Beginner.Arrays;

import java.util.Arrays;

public class AR_13_SortByParity {
    public static int[] sortArrayByParityByNewArray(int[] nums) {
//        This is done by making a new array instead of in-place
        int[] newArr = new int[nums.length];
        int currentIndex=0;
        //First adding even numbers in the starting
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]%2==0){
                newArr[currentIndex++] = nums[i];
            }
        }
        //Then adding odd numbers after even numbers have been added
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]%2 != 0){
                newArr[currentIndex++] = nums[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int []nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParityByNewArray(nums)));
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        //In-place
        //Even numbers comes first in the array followed by odd numbers

        int lastEvenIndex = 0;
        int lastIndex = nums.length-1;

        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]%2==0){
                //Adding the even numbers in the starting of the array
                int temp = nums[lastEvenIndex];
                nums[lastEvenIndex++] = nums[i];
                nums[i] = temp;
            }
        }
//        for (int i = 0; i <nums.length ; i++) {
//        Adding odd numbers in the starting of the array(reverse)
//            if (nums[i]%2!=0){
//                int temp = nums[lastIndex];
//                nums[lastIndex--] = nums[i];
//                nums[i] = temp;
//            }
//        }
        return nums;
    }
}
