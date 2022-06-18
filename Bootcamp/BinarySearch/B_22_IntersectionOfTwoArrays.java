package Bootcamp.BinarySearch;

import java.util.Arrays;
import java.util.HashSet;

public class B_22_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5} , nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        //Q349
        HashSet<Integer> integers = new HashSet<>();
        Arrays.sort(nums1);Arrays.sort(nums2);
        for (int i = 0; i < nums1.length; i++) {
            int j = 0;
            while ( j < nums2.length && nums2[j]<=nums1[i]){
                if (nums2[j]==nums1[i]){
                    integers.add(nums2[j++]);
                }else{
                    j++;
                }
            }
        }

        int[] ans = new int[integers.size()];
        Object[] hash = integers.toArray();
        for (int i = 0; i < ans.length ; i++) {
            ans[i] = (int) hash[i];
        }
        return ans;
    }
}
