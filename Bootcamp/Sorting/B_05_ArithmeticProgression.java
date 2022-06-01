package Bootcamp.Sorting;

public class B_05_ArithmeticProgression {
    public static void main(String[] args) {
        int [] arr = {3,5,-1,1,7,9,};
        System.out.println(canMakeArithmeticProgression(arr));
    }
    public static boolean canMakeArithmeticProgression(int[] arr) {
        // Q1502
        //First sorting the array
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j < arr.length - i ; j++) {
                if (arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        //Then checking whether it is AP or not
        if (arr.length==1) return true;
        int diff = arr[1] - arr[0];//Difference of an AP
        for (int i = 1; i < arr.length ; i++) {
            if ((arr[i]-arr[i-1]) != diff ){
                return false;
            }
        }
        return true;
    }
}