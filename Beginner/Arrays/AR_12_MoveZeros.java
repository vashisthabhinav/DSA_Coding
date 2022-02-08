package Beginner.Arrays;

public class AR_12_MoveZeros {
    public static void moveZeroes(int[] nums) {
        //Looking for non-zero elements and placing them in the beginning of the array
        int nonZeroNumber = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=0){
                nums[nonZeroNumber] = nums[i];
                nonZeroNumber++;
            }
        }
        //As all the non-zero numbers are placed in the starting of the array, zeros can be added in the least
        //starting from the index of nonZeroNumber

        for (int i = nonZeroNumber; i <nums.length ; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.print("{");
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i] +", ");
        }
        System.out.println("}");
    }
}
