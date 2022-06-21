package DSA.Bitwise;

import java.util.Arrays;

public class B_16_DecodeXORedArray {
    public static void main(String[] args) {
        int[] encoded = {1,2,3};
        int first = 1;
        System.out.println(Arrays.toString(decode(encoded,first)));
    }
    public static int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length+1];
        // Given that encoded[i] = arr[i] XOR arr[i + 1]
        // then arr[i+1] = encoded[i] XOR arr[i].
        arr[0] = first;//Given
        for (int i = 0; i <arr.length-1 ; i++) {
            arr[i+1] = encoded[i]^arr[i];
        }

        return arr;
    }
}
