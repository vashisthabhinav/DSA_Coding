package DSA.Arrays;

public class K_11_ReshapeTheMatrixR {
    public static void main(String[] args) {
        int [][] mat = {{1,2,3,4}};
        int r = 2 , c = 2;
        int [][] ans = matrixReshape(mat,r,c);
        for (int i = 0; i < ans.length ; i++) {
            for (int j = 0; j <ans[i].length ; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] matrixReshape(int[][] mat, int row, int col) {

        //Time Complexity : O(originalRow*originalColumn) -- original array row and col
        //Space Complexity : O(row*col)

        int originalRow = mat.length;
        int originalColumn = mat[0].length;

        if(((originalRow == row) && (originalColumn == col)) || ((originalRow * originalColumn) != (row*col))){
            return mat;
        }

        int[][] newMat = new int[row][col];
        int a = 0;
        int b = 0;
        for(int i = 0; i < originalRow ; i++){
            for(int j = 0 ; j < originalColumn ; j++){
                newMat[a][b] = mat[i][j];
                if((b == (col-1)) && (a < row-1)){
                    a++;
                }
                b++;
                b = b % col;
            }
        }
        return newMat;
    }
}
