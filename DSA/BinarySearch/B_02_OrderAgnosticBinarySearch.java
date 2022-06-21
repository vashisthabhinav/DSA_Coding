package DSA.BinarySearch;

public class B_02_OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,8,9,12,34,67,89};
        int [] decreasingArr = {102,98,76,65,54,43,21,12,3};
        int target = 12;
        System.out.println(binarySearch(arr,target));
        System.out.println(binarySearch(decreasingArr,target));
    }
    static int binarySearch(int[] arr,int target){
        if (arr.length==0) return -1;
        int start = 0;
        int end = arr.length-1;

        // Find whether the array is sorted in ascending order or descending order
        boolean isAsc = arr[start]<arr[end];
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid]==target)return mid;//ans
            if (isAsc){
                if (target<arr[mid]) end = mid-1;
                else if (target>arr[mid]) start = mid+1;
            }else {
                if (target<arr[mid]) start = mid+1;
                else if (target>arr[mid]) end = mid-1;
            }
        }
        return -1;
    }
}
