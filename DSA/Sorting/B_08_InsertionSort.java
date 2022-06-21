package DSA.Sorting;

import java.util.Arrays;

public class B_08_InsertionSort {
    public static void main(String[] args) {
        int [] arr = {3,4,2,6,5,1};
        System.out.println("Arrays before Insertion Sort: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Arrays after Insertion Sort: " + Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;//Breaking as rest of the left part of the array will already be sorted
                }
            }
        }
    }
}
