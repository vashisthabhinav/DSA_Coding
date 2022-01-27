package Beginner.Arrays;

public class AR_07_RemoveDuplicates {
    public static int removeDuplicates1(int[] nums) {
        
        /*
        Problem with this method is that the relative order of elements is not same.
         */
        
        if(nums.length == 0) return 0;
        int k= nums.length;
        int j= 0;//No of occurrences of the element to be removed
        int m = nums.length-1;
        for (int i = nums.length-1; i >=1 ; i--) {
            //Traversing from back. If we find any nums[i]  equal to the value, then it is swapped in the last value(where swapping has not occurred before)
            if (nums[i]==nums[i-1]){
                int temp =nums[i];
                nums[i]=nums[m];
                nums[m]= temp;
                m--;
                j++;
            }
        }
        return k-j;

    }

    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
//        System.out.println(removeDuplicates1(nums));
        System.out.println(removeDuplicates2(nums));
        System.out.print("{");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println("}");
    }

    public static int removeDuplicates2(int[] nums) {
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
}
