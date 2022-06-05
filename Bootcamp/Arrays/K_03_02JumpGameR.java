package Bootcamp.Arrays;

public class K_03_02JumpGameR {
    public static void main(String[] args) {
        int[] arr = {3,2,1,0,4};
        System.out.println(canJump(arr));
    }
    public static boolean canJump(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (i>index){
                return false;
            }
            int maxJump = i+nums[i];//Maximum possible jump from a particular index of the array
            index = Math.max(index,maxJump);
        }
        return true;
    }
}