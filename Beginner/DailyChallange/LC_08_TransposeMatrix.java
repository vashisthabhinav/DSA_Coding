package Beginner.DailyChallange;

import java.util.Arrays;

public class LC_08_TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix =
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("*********************");
        int [][] ans = transpose(matrix);
        for (int i = 0; i <ans.length ; i++) {
            for (int j = 0; j <ans[i].length ; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] ans = new int[n][m];//Making an empty matrix that can be used as the transpose of the matrix
        //The number of columns in this matrix will be equal to number of rows of the original matrix and vice-versa.
        for (int j = 0; j < n; j++)
            //Now traversing the row of the new matrix
            for (int i = 0; i < m; i++)
                //And picking the element-position in the matrix
                ans[j][i] = matrix[i][j];//Transpose of matrix
        return ans;
    }
}
