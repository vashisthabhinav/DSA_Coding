package DSA.Bitwise;

import java.util.Arrays;

public class B_11_FlipImage {
    public static void main(String[] args) {
        int [][] arr =
                {
                        {1,1,0},
                        {1,0,1},
                        {0,0,0}
                };
        int[][] ans = flipAndInvertImage(arr);
        for (int i = 0; i <ans.length ; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        //Q832

        for (int[] index :image) {
            for (int j = 0; j < (image[0].length)/2 ; j++) {
                //Swapping
                int temp = index[j];
                index[j] = index[image[0].length-1-j];
                index[image[0].length-1-j] = temp;
            }
        }
        for (int[] index :image) {
            for (int j = 0; j < (image[0].length) ; j++) {
                //XOR with 1 for reversing
                index[j] = index[j]^1;
            }
        }

        return image;
    }
}
