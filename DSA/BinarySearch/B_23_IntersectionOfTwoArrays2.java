//package Bootcamp.BinarySearch;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class B_23_IntersectionOfTwoArrays2 {
//    public static void main(String[] args) {
//        int[] nums1 = {1,2,2,1};
//        int[] nums2 = {2,2};
//        System.out.println(Arrays.toString(intersect(nums1,nums2)));
//    }
//    public static int[] intersect(int[] nums1, int[] nums2) {
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        int i = 0;
//        int j = 0, max =
//        ArrayList<Integer> list = new ArrayList<>();
//        while(i< nums1.length && j < nums2.length){
//            if(nums1[i] == nums2[j]){
//                list.add(nums1[i++]);
//                j++;
//            }else if(nums1[i] < nums2[j]){
//                i++;
//            }
//            else{
//                j++;
//            }
//        }
//        int [] ans = new int[list.size()];
//        for (int k = 0; k < ans.length; k++) {
//            ans[k] = list.get(k);
//        }
//        return ans;
//    }
//
//}
