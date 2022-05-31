package Bootcamp.Sorting;

import java.util.Arrays;

public class B_01_BubbleSort {
    public static void main(String[] args) {
        int [] arr = {3,4,2,6,5,1};
        System.out.println("Arrays before Bubble Sort: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Arrays after Bubble Sort: " + Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        //Bubble sort

        //One thing to note is that these loops will run even if the array is sorted
        // So using a boolean to check whether there is any swap occurring or not as if no swap occurs in the ith step
        // then it means every element is sorted and no need to check in the (i+1)th method

        boolean swapped = false;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 1; j <arr.length-i ; j++) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){//!false = true
                //swapped is false is there was no swap in previous iteration so cancelling the next iteration
                break;
            }
        }
    }
}