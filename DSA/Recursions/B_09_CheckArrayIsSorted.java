package DSA.Recursions;

public class B_09_CheckArrayIsSorted {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,8,7};
        System.out.println(sorted(nums,0));
    }
    public static boolean sorted(int[] nums , int index){
        if (index==nums.length-1) return true;

        return (nums[index] < nums[index+1] && sorted(nums, index+1));
    }
}
