package DSA.Sorting;

import java.util.Arrays;

public class B_03_InsertionSort {
    public static void main(String[] args) {
        int [] arr = {3,4,2,6,5,1};
        System.out.println("Arrays before Insertion Sort: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Arrays after Insertion Sort: " + Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    public static void swap(int[]arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
