package DSA.Sorting;

import java.util.Arrays;

public class B_02_SelectionSort {
    public static void main(String[] args) {
        int [] arr = {3,4,2,6,5,1};
        System.out.println("Arrays before Selection Sort: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Arrays after Selection Sort: " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            //Finding the maximum item in the remaining array and swap with correct index
            int last = arr.length - 1 -i;
            int maxIndex = getMaxIndex(arr,0,last);
            //Swap
            swap(arr,maxIndex,last);
        }
    }
    public static void swap(int[]arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;//Assuming max element is start
        for (int i = start; i <=end ; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
