package Bootcamp.Sorting;

import java.util.Arrays;

public class B_09_CyclicSort {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println("Arrays before Cyclic Sort: " + Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println("Arrays after Cyclic Sort: " + Arrays.toString(arr));
    }

    public static void cyclicSort(int[] arr) {
     int i = 0;
     while (i < arr.length){
         int correct = arr[i] - 1;//Correct index of the element (value - 1)

          if (arr[i] != arr[correct]){
              swap(arr,i,correct);
          }else{
              i++;
          }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
