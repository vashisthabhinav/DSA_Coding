package DSA.Arrays;

public class K_10_MatrixDiagonalSum {
    public static void main(String[] args) {
        int [][] mat =
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };
        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat) {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int sum = 0;
        int n = mat.length-1;
        for (int i = 0; i < mat.length ; i++) {
            primaryDiagonalSum += mat[i][i];
            secondaryDiagonalSum += mat[i][n--];
        }
        if (mat.length % 2 ==0){
            sum = primaryDiagonalSum + secondaryDiagonalSum;
        }else{
            secondaryDiagonalSum -= mat[mat.length/2][mat.length/2];
            sum = primaryDiagonalSum + secondaryDiagonalSum;
        }
        return sum;
    }
}