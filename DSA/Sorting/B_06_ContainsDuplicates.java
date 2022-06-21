package DSA.Sorting;

public class B_06_ContainsDuplicates {
    public static void main(String[] args) {
        int [] arr = {4,2,1,3,1};
        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] nums) {
        //Q217

        //Brute force--> To be optimized
        //First sorting the array
        
        //Bubble Sort
//        for (int i = 0; i < nums.length ; i++) {
//            for (int j = 1; j < nums.length - i ; j++) {
//                if (nums[j-1] > nums[j]){
//                    int temp = nums[j];
//                    nums[j] = nums[j-1];
//                    nums[j-1] = temp;
//                }
//            }
//        }
        
        //Insertion Sort
        for (int i = 0; i < nums.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }else{
                    break;//Breaking as rest of the left part of the array will already be sorted
                }
            }
        }
        
        //Then checking for the duplicates if any
        for (int j = 1; j < nums.length ; j++) {
            if (nums[j]==nums[j-1]){
                return true;
            }
        }
        return false;
    }
}
