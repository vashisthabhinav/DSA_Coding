package DSA.StackAndTree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class B_01_NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
        System.out.println(Arrays.toString(nextGreaterElement1(nums1,nums2)));

    }
    /*
    The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
    Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
    Output: [-1,3,-1]
    Explanation: The next greater element for each value of nums1 is as follows:
    - 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
    - 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
    - 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
     */
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //Q496
        //Brute Force O(n^2)
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i < nums2.length; i++){
            //Inserting mapping of {nums2[i],index} (key, value)
            map.put(nums2[i],i);
            /*
            After mapping, map will look like:
            1 -> 0
            2 -> 3
            3 -> 1
            4 -> 2
             */
        }
        for(int i = 0; i < nums1.length; i++){
            for(int j = map.get(nums1[i]); j < nums2.length; j++){
                if(nums2[j] > nums1[i]){
                    nums1[i] = nums2[j];
                    break;
                }
                else if(j == nums2.length-1){
                    nums1[i] = -1;
                }
            }
        }
        return nums1;
    }
    public static int[] nextGreaterElement1(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }
}
