package Beginner.Arrays;

import java.util.Arrays;

public class AR_14_Remove {
    public static int removeElement1(int[] nums, int val) {
        int k = 0;

        for (int element:nums) {//For each element in nums-
            if (element!=val){//If the value of the current element is not equal to val-
                nums[k]=element;//Adding that value in the array at position k
                k++;//Incrementing k
            }//Else not adding
        }
        return k;
    }

    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
//        removeElement1(nums,2);
        removeElement2(nums,2);
        System.out.print("{");
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i] +", ");
        }
        System.out.println("}");
        System.out.println(removeElement2(nums,2));
        System.out.println(removeElement1(nums,2));

    }

    public static int removeElement2(int[] nums, int value) {

//        Moving the element to be removed at the end of the array.
        int index = 0;
        int i = nums.length-1;
        for (int j = nums.length-1; j > -1 ; j--) {
            if (nums[j]==value){
                nums[j] = nums[i--];
                index++;
            }
        }
        return nums.length- index;
    }
}
