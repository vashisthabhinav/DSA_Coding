package Beginner.Arrays;

import java.util.Arrays;

public class AR_05_MergeSortedArray {
    /*
    Merge nums1 and nums2 into a single array sorted in non-decreasing order.
    nums1 has length of m+n where m and n are number of integers in nums1 and nums2 respectively.

     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int lastIndex = m + n - 1;//Last index of the combined array

        int mEnd = m - 1;//As m is representing the number of elements in nums1, the last index of nums1 will be m-1

        int nEnd = n - 1;//As n is representing the number of elements in nums2, the last index of nums2 will be n-1

        while (mEnd >= 0 && nEnd >= 0) {//Till there are elements in the array-

            //Adding numbers into nums1 array from backside
            if (nums2[nEnd] >= nums1[mEnd]) {
                //If the last value of nums2 is greater than last value of nums1, then-
                nums1[lastIndex] = nums2[nEnd];//Last index of the combined nums1 is given the value of last element of nums2
                nEnd--;//Then the index of nums2 is decreased by one so as to check the previous index
            } else {
                //If the last value of nums1 is greater than last value of nums2, then-
                nums1[lastIndex] = nums1[mEnd];//Last index of the combined nums1 is given the value of last element of nums1
                mEnd--;//Then the index of nums2 is decreased by one so as to check the previous index
            }
            lastIndex--;//The last position of the combined nums1 is filled so,the index is decreased by one and the loop is repeated
        }

        //only need to combine with remaining nums2
        /*
        We assume that nums2 will be bigger and we will have to combine it-
        Because if nums1 is bigger and nums 2 is shorter, when nums2 reaches the end, nothing needs to be done for nums1 (we insert nums2 into nums1).
        Nums1 remains the same in that way.
         */
        while (nEnd >= 0) {//Till the time nEnd is greater than 0-
            nums1[lastIndex] = nums2[nEnd];
            lastIndex--;
            nEnd--;
        }
    }
}
