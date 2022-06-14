package Bootcamp.BinarySearch;

public class B_14_MissingPositiveNumber {
    // Q1539 LeetCode
    public static void main(String[] args) {
        int [] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));
    }
    public static int findKthPositive(int[] arr, int k) {
        int missingPositive = 0, start = 0, end = arr.length-1, kthMissingNum = 1;//Only checking from 1, so let kth missing number = 1

        while (missingPositive<=k){
            if (binarySearch(arr,start,end,kthMissingNum)==-1) {
                //It means that i number is not present in the array
                //So we have found one missing positive so incrementing it (and i as well to check for next number)
                missingPositive++;
                if (missingPositive==k) break;//Breaking the loop as we have found our kth missing number i.e., i
                kthMissingNum++;
            }else{
                // i was present in the array so checking for the next number
                kthMissingNum++;
            }
        }
        return kthMissingNum;
    }
    public static int binarySearch(int[] arr, int start, int end, int target){
        if (arr.length==0) return -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target<arr[mid]) end = mid-1;
            else if (target>arr[mid]) start = mid+1;
            else return mid;//ans
        }
        return -1;
    }
}
