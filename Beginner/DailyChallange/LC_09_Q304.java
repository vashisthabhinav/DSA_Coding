package Beginner.DailyChallange;

public class LC_09_Q304 {

}

class NumMatrix {

    long[][] dp;

    public NumMatrix(int[][] matrix) {
        int ylength = matrix.length + 1, xlength = matrix[0].length + 1;
        dp = new long[ylength][xlength];
        for (int i = 1; i < ylength; i++)
            for (int j = 1; j < xlength; j++)
                dp[i][j] = matrix[i-1][j-1] + dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1];
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return (int)(dp[row2+1][col2+1] - dp[row2+1][col1] - dp[row1][col2+1] + dp[row1][col1]);
    }
}
