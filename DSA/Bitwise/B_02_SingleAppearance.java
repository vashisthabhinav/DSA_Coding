package DSA.Bitwise;

public class B_02_SingleAppearance {
    /*
    GIven an array. Every element appears twice except one. Find that number.
     */
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,6,4,3};
        System.out.println(singleOccurrence(arr));
    }

    public static int singleOccurrence(int[] arr) {
        int uniqueElement = 0;
        for (int i = 0; i <arr.length ; i++) {
            uniqueElement ^= arr[i];//XOR operator
        }
        return uniqueElement;
    }

}
