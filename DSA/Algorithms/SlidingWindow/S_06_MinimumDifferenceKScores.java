package DSA.Algorithms.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;

public class S_06_MinimumDifferenceKScores {
    public static void main(String[] args) {
        int[]nums = {9,4,1,7};
        int k = 2;
        System.out.println(minimumDifference(nums,k));
    }
    public static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int i = 0 , j = 0 ,ans = Integer.MAX_VALUE , min = 0 ,n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        while(j<n){
            arr.add(nums[j]);
            if(j-i+1<k){
                j++;
            }else{
                min = arr.get(arr.size()-1) - arr.get(0);
                ans = Math.min(ans,min);
                arr.remove(0);
                i++;
                j++;
            }
        }
        return ans;
    }
}
