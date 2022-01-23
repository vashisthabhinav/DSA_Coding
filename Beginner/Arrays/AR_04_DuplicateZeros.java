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

    public static void duplicateZerosMethod2(int[] arr) {
        int possibleDuplicates = 0;
        int length_ = arr.length - 1;

        // Find the number of zeros to be duplicated
        // Stopping when left points beyond the last element in the original array
        // which would be part of the modified array
        for (int left = 0; left <= length_ - possibleDuplicates; left++) {

            // Count the zeros
            if (arr[left] == 0) {

                // Edge case: This zero can't be duplicated. We have no more space,
                // as left is pointing to the last element which could be included
                if (left == length_ - possibleDuplicates) {
                    // For this zero we just copy it without duplication.
                    arr[length_] = 0;
                    length_ -= 1;
                    break;
                }
                possibleDuplicates++;
            }
        }

        // Start backwards from the last element which would be part of new array.
        int last = length_ - possibleDuplicates;

        // Copy zero twice, and non zero once.
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDuplicates] = 0;
                possibleDuplicates--;
                arr[i + possibleDuplicates] = 0;
            } else {
                arr[i + possibleDuplicates] = arr[i];
            }
        }
    }
}
