package DSA.Algorithms.SlidingWindow;

import java.util.*;

public class S_04_SlidingWindowMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        Collections.addAll(A,648, 614, 490, 138, 657, 544, 745, 582, 738, 229, 775, 665, 876, 448, 4, 81, 807, 578, 712, 951, 867, 328, 308, 440, 542, 178, 637, 446, 882, 760, 354, 523, 935, 277, 158, 698, 536, 165, 892, 327, 574, 516, 36, 705, 900, 482, 558, 937, 207, 368);
        System.out.println(slidingMaximum(A,9));
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums,k)));
    }
    public static ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> tentativeMax = new ArrayList<>();
        int i = 0 , j = 0;
        while(j < A.size()){
            int k = tentativeMax.size()-1;
            while (tentativeMax.size() != 0 && tentativeMax.get(k) < A.get(j)){
                tentativeMax.remove(k--);
            }
            tentativeMax.add(A.get(j));
            if (j-i+1<B){
                j++;
            }
            else{
                ans.add(tentativeMax.get(0));
                if (Objects.equals(tentativeMax.get(0), A.get(i))){
                    //equals removes the null case
                    tentativeMax.remove(0);
                }
                i++;
                j++;
            }
        }
        return ans;
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        int arrIndex = 0;
        ArrayList<Integer> tentativeMax = new ArrayList<>();
        int i = 0 , j = 0;
        while(j < nums.length){
            int index = tentativeMax.size()-1;
            while (tentativeMax.size() != 0 && tentativeMax.get(index) < nums[j]){
                tentativeMax.remove(index--);
            }
            tentativeMax.add(nums[j]);
            if (j-i+1<k){
                j++;
            }
            else{
                ans[arrIndex++] = tentativeMax.get(0);
                if (Objects.equals(tentativeMax.get(0), nums[i])){//equals removes the null case
                    tentativeMax.remove(0);
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
