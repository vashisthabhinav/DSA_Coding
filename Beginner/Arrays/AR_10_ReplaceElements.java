package Beginner.Arrays;

import java.util.Arrays;

public class AR_10_ReplaceElements {
    public static int[] replaceElements(int[] arr) {
        if(arr.length==0)return null;
        for (int i = 0; i < arr.length ; i++) {
            //Traversing the array
            int maxValue = -1;
            for (int j = i+1; j < arr.length ; j++) {//This loop will run for all the elements except the last element.
                //Checking the values on the right side of the given index.
                if (arr[j]>maxValue){
                    maxValue = arr[j];
                }
            }
            arr[i] = maxValue;//Placing the value of the largest number to the right in the array.
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
}
