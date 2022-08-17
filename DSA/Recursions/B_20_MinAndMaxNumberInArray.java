package DSA.Recursions;

public class B_20_MinAndMaxNumberInArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,6,8,3,4,0};
        System.out.println(minNumber(nums,nums.length));
        System.out.println(maxNumber(nums,nums.length));
    }

    private static int maxNumber(int[] nums, int n) {
        if (n==1) return nums[0];
        return Math.max(nums[n-1],maxNumber(nums,n-1));
    }

    private static int minNumber(int[] nums, int n) {
        if (n==1) return nums[0];
        //if size is equal to 0, then it means that the whole array has been traversed
        return Math.min(nums[n-1],minNumber(nums,n-1));
    }
}
