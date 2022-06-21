package DSA.Arrays;

import java.util.HashSet;

public class K_12_CheckValidMatrix {
    public static void main(String[] args) {
        int[][] matrix =
                {
                        { 1, 3, 5, 7},
                        {10,11,16,20},
                        {23,30,34,60}
                };
        System.out.println(checkValid(matrix));
    }
    public static boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        HashSet<Integer> rowSet = new HashSet<Integer>();
        HashSet<Integer> colSet = new HashSet<Integer>();

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++){
                // Add row and col values to set
                rowSet.add(matrix[i][j]);
                colSet.add(matrix[j][i]);
            }
            // If row or col does not have n values, it means there are duplicates in the row or col
            if(rowSet.size() != n || colSet.size() != n) {
                return false;
            }
            // reset for next row and col
            rowSet = new HashSet<Integer>();
            colSet = new HashSet<Integer>();
        }

        return true;
    }
}
