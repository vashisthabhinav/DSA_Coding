package Beginner.Arrays;

import java.util.Arrays;

public class AR_04_DuplicateZeros {
    public static void duplicateZerosMethod1(int[] arr) {
        int l = arr.length;
        int ind = 0;
        int p = 0;
        while (ind < l) {
            if (arr[p] == 0) {
                ind += 2;
            } else {
                ind++;
            }
            p++;
        }
        ind--;
        p--;
        boolean flag = false;
        if (arr[p] == 0 && ind > l - 1) {
            flag = true; // There is a zero can't be added to arr twice at the tail
        }

        int i = l - 1;
        while (p >= 0) {
            if (flag && i == l - 1) {
                // Added the zero only once at tail and continue to other loops
                arr[i--] = 0;
                p--;
                flag = false;
                continue;
            }
            if (arr[p] == 0) {
                arr[i--] = 0;
            }
            arr[i--] = arr[p--];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 3, 0, 4, 5, 0};
//        duplicateZerosMethod1(nums);

        duplicateZerosMethod2(nums);
        System.out.print("{");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println("}");
    }

    public static void duplicateZerosMethod2(int[] nums) {
        int noOfZeros=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]==0){
                noOfZeros++;
            }
        }
        int [] newArray = new int[nums.length+noOfZeros];
        for (int i = 0; i <nums.length ; i++) {
            newArray[i]=nums[i];
        }
//        System.out.println(Arrays.toString(newArray));

    }
}