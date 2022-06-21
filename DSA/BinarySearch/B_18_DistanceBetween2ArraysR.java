package DSA.BinarySearch;

import java.util.Arrays;

public class B_18_DistanceBetween2ArraysR {
    public static void main(String[] args) {
        int [] arr1 = {4,5,8};
        int [] arr2 = {10,9,8,1};
        int d = 2;
        System.out.println(findTheDistanceValue(arr1,arr2,d));
    }
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        //Before comparing, sorting arr2
        Arrays.sort(arr2);
        /*
        The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.
        Therefore, we can say that arr1[i] - d <= arr2[j] <= arr[i] +d (Inequality)
         */
        int distance = 0;
        for (int i = 0; i < arr1.length ; i++) {
            if (range(arr2,arr1[i]-d,arr1[i]+d)) {
                distance++;
            }
        }
        return distance;
    }

    private static boolean range(int[] arr2, int startingFrom, int endingInto) {
        int start = 0 , end = arr2.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (arr2[mid] >= startingFrom && arr2[mid] <= endingInto) return false;
            else if (arr2[mid] < startingFrom) start = mid + 1;
            else end = mid - 1;
        }
        return true;
    }
}
