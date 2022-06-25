package DSA.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class H_12_DiagonalMatrix {
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>();
        nums1.add(11);
        nums1.add(2);
        nums1.add(4);
        List<Integer> nums2 = new ArrayList<>();
        nums2.add(4);
        nums2.add(5);
        nums2.add(6);
        List<Integer> nums3 = new ArrayList<>();
        nums3.add(10);
        nums3.add(8);
        nums3.add(-12);
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(nums1);
        arr.add(nums2);
        arr.add(nums3);
        System.out.println(diagonalDifference(arr));
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        int ans = 0 , primaryDiagonal = 0 , secondaryDiagonal = 0 , n = arr.size()-1;
        for (int i = 0; i < arr.size(); i++) {
            primaryDiagonal += arr.get(i).get(i);
            secondaryDiagonal += arr.get(i).get(n--);
        }
        ans = primaryDiagonal-secondaryDiagonal;
        if (ans<0){
            ans = -ans;
        }
        return ans;
    }
}
