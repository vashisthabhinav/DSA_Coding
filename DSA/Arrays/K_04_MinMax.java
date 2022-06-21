package DSA.Arrays;

public class K_04_MinMax {
    public static void main(String[] args) {
        int [] nums = {1,3,5,2,4,8,2,2};
        System.out.println(minMaxGame(nums));
    }
    public static int minMaxGame(int[] nums) {
        int n = nums.length;
        if (n==1){
            return nums[0];
        }
        int[] newNums = new int[n/2];
        for (int i = 0; i <n/2 ; i++) {
            if (i%2==0){
                newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
            }else{
                newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
            }
        }
        if (newNums.length>1){
            return minMaxGame(newNums);
        } return newNums[0];
    }
}
