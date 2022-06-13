package Bootcamp.Math;

public class B_13_SignOfProduct {
    public static void main(String[] args) {
        int []nums = {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        System.out.println(arraySign(nums));
        System.out.println(arraySign1(nums));
    }
    public static int arraySign(int[] nums) {
        long product = 1;
        for (int i = 0; i < nums.length ; i++) {
            product *= nums[i];
        }
        System.out.println(product);
        if (product>0) return 1;
        else if (product<0) return -1;
        else return 0;
    }
    public static int arraySign1(int[] nums) {
        int negativeCount = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]==0) return 0;
            if (nums[i]<0) negativeCount++;
        }
        if (negativeCount%2==0) return 1;
        else return -1;
    }
}
