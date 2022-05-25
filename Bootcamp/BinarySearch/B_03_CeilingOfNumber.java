package Bootcamp.BinarySearch;

public class B_03_CeilingOfNumber {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 10;
        //Ceiling = Smallest element in the array greater than or equal to the target element.
        System.out.println(ceiling(arr,target));
    }
     static int ceiling(int[] arr,int target) {
//        What if the target element is greater than the largest element in the array.
         if (target>arr[arr.length-1]) return -1;
        int start = 0;
        int end = arr.length-1;
         while (start<=end){
             int mid = start + (end-start)/2;
             if (target<arr[mid]) end = mid-1;
             else if (target>arr[mid]) start = mid+1;
             else return mid;//ans
         }
         return start;
         //Loop breaks when s>e so a number greater than the target will have the index of the value of start at that time.
    }
}