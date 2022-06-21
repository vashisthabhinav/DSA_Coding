package DSA.LinearSearch;
/* a linear search or sequential search is a method for finding an element within a list. 
It sequentially checks each element of the list until a match is found or the whole list has been searched.*/
public class B01_LinearSearch {
    public static void main(String[] args) {
        int [] nums = {12,34,56,78,21,54,3,76,89};
        int target = 56;
        System.out.println(linearSearch(nums,target));
        System.out.println(linearSearch2(nums,target));
        System.out.println(linearSearch3(nums,target));
        System.out.println(findMin(nums,target));
    }

     static int findMin(int[] nums, int target) {
        if (nums.length==0) return Integer.MIN_VALUE;
        int min = nums[0];
        for (int i = 1; i <nums.length ; i++) {
            if (min>nums[i]) min = nums[i];
        }
        return min;
    }

     static int linearSearch(int[] nums, int target) {//Returns index of the target
        if (nums.length==0){
            return -1;
        }
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]==target){
                return i;
            }
        }
        return -1;
    }
     static boolean linearSearch2(int[] nums, int target) {//Returns true false
        if (nums.length==0){
            return false;
        }
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]==target){
                return true;
            }
        }
        return false;
    }
     static int linearSearch3(int[] nums, int target) {//Returns element
        if (nums.length==0){
            return Integer.MIN_VALUE;
        }
        for (int i = 0; i < nums.length ; i++) {
//            if (nums[i]==target){
//                return target;
//            } or
             int element=nums[i] ;
            if (element==target) return element;
        }
        return Integer.MIN_VALUE;
    }
}
