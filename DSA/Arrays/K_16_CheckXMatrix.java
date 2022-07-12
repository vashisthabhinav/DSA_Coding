package DSA.Arrays;

public class K_16_CheckXMatrix {
    public static void main(String[] args) {
        int[][] matrix =
                {
                        {2,0,0,1},
                        {0,3,1,0},
                        {0,5,2,0},
                        {4,0,0,2}
                };
        System.out.println(checkXMatrix(matrix));
    }
    public static boolean checkXMatrix(int[][] grid) {
        int n = grid.length-1;
        //Making a boolean matrix of same dimensions as of the grid to check whether we have visited that element or not
        boolean[][] isVisited = new boolean[grid.length][ grid.length];
        for (int i = 0; i < grid.length; i++) {
            //For primary diagonal
            if (grid[i][i]==0){
                //We have found one breakage to the rule as diagonal is zero, so returning false
                return false;
            }else{
                isVisited[i][i] = true;
                //Else the diagonal matrix is 0, and we have visited that element
            }
            //For primary diagonal
            if (grid[i][n]==0){
                //We have found one breakage to the rule as diagonal is zero, so returning false
                return false;
            }else {
                //Else we have visited this element
                isVisited[i][n--] = true;
                //Decreasing n for the next iteration to get secondary diagonal
            }
        }
        //Now, checking for the remaining grid and as we have already marked the diagonals as visited,
        // we will only check for the remaining elements
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (!isVisited[i][j]){
                    //All the elements except those present in diagonals now can be differentiated
                    if (grid[i][j]!= 0){
                        //If they are not equal to zero, then the condition does not hold, and we return the ans
                        return false;
                    }
                }
            }
        }
        //Else if we have traversed entirely and no condition has broken, it means that the ans is true
        return true;
    }
}