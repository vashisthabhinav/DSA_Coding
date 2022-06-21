package DSA.BinarySearch;

public class B_01_BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,3,4,6,8,9,12,34,67,89};
        int target = 12;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr,int target){
        if (arr.length==0) return -1;
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if (target<arr[mid]) end = mid-1;
            else if (target>arr[mid]) start = mid+1;
            else return mid;//ans
        }
        return -1;
    }
}
