package Beginner.Arrays;

import java.util.HashSet;

public class AR_08_CheckIfExists {
    /*
    Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
More formally check if there exists two indices i and j such that :
i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
     */
    public static boolean checkIfExist1(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if (i!=j && arr[i] == 2 * arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {7,1,14,11};
//        System.out.println(checkIfExist1(arr));
        System.out.println(checkIfExist2(arr));
    }

    public static boolean checkIfExist2(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr) {//For every element in the array
            if(set.contains(i*2) || (i%2 == 0 && set.contains(i/2))) {
                /*
                (a%2 == 0 && set.contains(a/2)) for interpreting when smaller number comes first and double of it comes later
                we have to check for (a/2) too, instead of only using (a*2) because-
                to check whether a/2 has occurred before the current element or not.
                 */
                return true;
            }
            set.add(i);
        }
        return false;
    }

}
