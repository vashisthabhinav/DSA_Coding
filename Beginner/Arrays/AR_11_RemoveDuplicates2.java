package Beginner.Arrays;

public class AR_11_RemoveDuplicates2 {
    public static int removeDuplicates1(int[] nums) {
        if(nums.length == 0) return 0;
        int k = 1;
        for(int i = 1; i < nums.length; i++){//For each element in nums-
            if(nums[i] != nums[i - 1]){//If the value of the current element is not equal to next element
                nums[k] = nums[i];//Adding that value in the array at position k
                k++;//Incrementing k
            }//Else not adding
        }
        return k;
    }

    public static void main(String[] args) {
        int []nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates1(nums));
//        System.out.println(removeDuplicates2(nums));
    }
}
