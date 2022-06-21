package DSA.Sorting;

import java.util.Arrays;

public class B_16_MergeSort {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println("Arrays before Merge Sort: " + Arrays.toString(arr));
        System.out.println("Arrays after Merge Sort: " + Arrays.toString(mergeSort1(arr)));
        int[] arr1 = {4,3,2,7,8,2,3,1};
        System.out.println("Arrays before Merge Sort: " + Arrays.toString(arr1));
        mergeSort2(arr1,0,arr.length);
        System.out.println("Arrays after Merge Sort: " + Arrays.toString(arr1));
    }
    public static int[] mergeSort1(int[] arr){
        if (arr.length==1) return arr;
        int mid = arr.length/2;
        int[] left = mergeSort1(Arrays.copyOfRange(arr,0,mid));
        //copyOfRange copies the range of specified array into a new array
        int[] right = mergeSort1(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    public static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length+ second.length];
        int
                firstPointer = 0 ,
                secondPointer = 0 ,
                mixPointer = 0;//Pointer for the new array
        while (firstPointer < first.length && secondPointer < second.length){
            if (first[firstPointer] < second[secondPointer]){
                mix[mixPointer++] = first[firstPointer++];
            }else{
                mix[mixPointer++] = second[secondPointer++];
            }
        }
        //It may be possible that one of the arrays is not complete when one array has ended
        //So, either of these loops will be true and will be executed
        while (firstPointer < first.length){
            mix[mixPointer++] = first[firstPointer++];
        }
        while (secondPointer < second.length){
            mix[mixPointer++] = second[secondPointer++];
        }
        return mix;
    }

    public static void mergeSort2(int[] arr, int start, int end){
        if (end-start==1) return;

        int mid = start + (end-start)/2;
        mergeSort2(arr, start , mid);
        //copyOfRange copies the range of specified array into a new array
        mergeSort2(arr, mid,end);
        mergeInPlace(arr,start,mid,end);
    }

    public static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];
        int
                firstPointer = start ,
                secondPointer = mid ,
                mixPointer = 0;//Pointer for the new array
        while (firstPointer < mid && secondPointer < end){
            if (arr[firstPointer] < arr[secondPointer]){
                mix[mixPointer++] = arr[firstPointer++];
            }else{
                mix[mixPointer++] = arr[secondPointer++];
            }
        }
        //It may be possible that one of the arrays is not complete when one array has ended
        //So, either of these loops will be true and will be executed
        while (firstPointer < mid){
            mix[mixPointer++] = arr[firstPointer++];
        }
        while (secondPointer < end){
            mix[mixPointer++] = arr[secondPointer++];
        }
        //We have the ans in mix, now copying the and into the original array
        for (int i = 0; i < mix.length ; i++) {
            arr[start+i] = mix[i];
        }
    }
}
