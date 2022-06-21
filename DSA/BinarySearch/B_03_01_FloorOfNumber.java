package DSA.BinarySearch;

public class B_03_01_FloorOfNumber {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 1;
        System.out.println(floor(arr,target));
    }

    public static int floor(int[] arr, int target) {
//        What if the target element is smaller than the smallest element in the array
//        The end will become -1 eventually as the array will keep on splitting by two.
//        So, the ans will be -1 automatically
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target<arr[mid]) end = mid-1;
            else if (target>arr[mid]) start = mid+1;
            else return mid;//ans
        }
        return end;
        // We will return end in this case as at the time the loop is breaking, the end index will be at the greatest number that is smaller to the target number
    }
}
