package Beginner.Arrays;

public class AR_09_MountainArray {
    public static boolean validMountainArray(int[] arr) {

        boolean isValidMountainArray;
        if (arr.length<3){
           return isValidMountainArray = false;
        }
        int leftside = 0;
        int rightside = arr.length - 1;

        while(leftside + 1 < arr.length - 1 && arr[leftside] < arr[leftside + 1]) {
            //Traversing the array from the front and incrementing the index of the highest number
            leftside++;
            //Checking the highest number from left side
        }
        while(rightside - 1 > 0 && arr[rightside] < arr[rightside - 1]) {
            //Traversing the array from the back and incrementing the index of the highest number
            rightside--;
            //Checking the highest number from right side
        }



         if (leftside == rightside){
             isValidMountainArray =true;
         }
         else isValidMountainArray = false;

         return isValidMountainArray;
    }

    public static void main(String[] args) {
        int [] arr = {2};
        System.out.println(validMountainArray(arr));
    }
}
