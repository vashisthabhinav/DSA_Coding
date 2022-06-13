package Bootcamp.Recursions;

import java.util.ArrayList;

public class B_10_LinearSearch {
    public static void main(String[] args) {
        int [] nums = {6,7,32,21,54,1,34,21,89,90};
        int target = 21;
        System.out.println(search1(nums,target,0));
        System.out.println(search(nums,target,0));
        System.out.println(searchFromLast(nums,target,nums.length-1));
        searchForAllIterations(nums,target,0);
        System.out.println(arrayList);
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        System.out.println(searchForAllIterations1(nums,target,0,arrayList1));
        System.out.println(searchForAllIterations2(nums,target,0));
    }
    public static int search(int[] nums, int target, int index) {
        if (index == nums.length - 1) return -1;
        if (nums[index] == target) return index;
        return search(nums, target, index + 1);
    }
    public static int searchFromLast(int[] nums, int target, int index) {
        if (index == -1) return -1;
        if (nums[index] == target) return index;
        return searchFromLast(nums, target, index - 1);
    }
    public static boolean search1(int[] nums, int target, int index){
        if (index > nums.length-1) return false;
        return nums[index] == target || search1(nums,target,index+1);
    }
    static ArrayList<Integer> arrayList = new ArrayList<>();
    public static void searchForAllIterations(int[] nums, int target, int index) {
        if (index == nums.length - 1) return;
        if (nums[index] == target) {
            arrayList.add(index);
        }
        searchForAllIterations(nums, target, index + 1);
    }
    public static ArrayList<Integer> searchForAllIterations1(int[] nums, int target, int index,ArrayList<Integer> arrayList) {
        //Passing list into the argument
        if (index == nums.length - 1) return arrayList;
        if (nums[index] == target) {
            arrayList.add(index);
        }
        return searchForAllIterations1(nums, target, index + 1, arrayList);
    }
    public static ArrayList<Integer> searchForAllIterations2(int[] nums, int target, int index) {
        //Passing list into the function body
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (index == nums.length - 1) return arrayList;

        if (nums[index] == target) {
            //This will contain answer for the ongoing function call only
            arrayList.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls =  searchForAllIterations2(nums, target, index + 1);
        arrayList.addAll(ansFromBelowCalls);
        return arrayList;
    }
}
