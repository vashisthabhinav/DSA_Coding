package Bootcamp.BinarySearch;

import javax.imageio.ImageTranscoder;
import java.util.Arrays;

public class B_01_BinarySearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr =
                {
                    {10,20,30,40},
                    {15,25,35,45},
                    {28,29,37,49},
                    {33,34,38,50}
                };
        int target1 = 33;
        int [] [] sortedMatrix =
                {
                        { 1, 2, 3, 4},
                        { 5, 6, 7, 8},
                        { 9,10,11,12},
                        {13,14,15,16}
                };
        int target2 = 8;
        System.out.println(Arrays.toString(searchIn2dArray(arr, target1)));
        System.out.println(Arrays.toString(binarySearchIn2dArray(sortedMatrix, target2)));
    }

    public static int[] binarySearchIn2dArray(int[][] matrix, int target) {
        int     rows = matrix.length ,
                cols = matrix[0].length;//Matrix mqy be empty so keep in mind
        if (cols == 0){
            return new int[] {-1,-1};
        }
        if (rows==1){
            //If we have just one single row, then applying simple binary search in that row
            return simpleBinarySearch(matrix,0,0,cols-1,target);
        }
        //Run the loop till two rows are remaining
        int     rStart = 0,
                rEnd = rows-1,
                cMid = cols/2;
        while (rStart < (rEnd-1)){//While this is true, it will be having more than two rows
            int rMid = rStart + (rEnd - rStart)/2;

            if (matrix[rMid][cMid]==target){
                return new int[]{rMid,cMid};
            }else if(matrix[rMid][cMid] < target){
               rStart = rMid;//Ignoring above rows
            }else{
                rEnd = rMid;//Ignoring the below rows
            }
        }
        //Once this loop has run, we have two rows

        //Now checking whether the middle column has the target
        if (matrix[rStart][cMid] == target){
            return new int[] {rStart, cMid};
        }
        else if(matrix[rStart+1][cMid] == target){
            return new int[] {rStart+1, cMid};
        }

        //Search in 1st part
        if (target <= matrix[rStart][cMid-1]){
            return simpleBinarySearch(matrix,rStart,0,cMid-1,target);
        }
        //Search in 2nd part
        if (target >= matrix[rStart][cMid+1] && target<=matrix[rStart][cols-1]){
            return simpleBinarySearch(matrix,rStart,cMid+1,cols-1,target);
        }
        //Search in 3rd part
        if (target <= matrix[rStart+1][cMid-1]){
            return simpleBinarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        //Search in 4th part
        else{//if (target >= matrix[rStart+1][cMid+1])
            return simpleBinarySearch(matrix,rStart+1,cMid+1,cols-1,target);
        }
    }
    public static int[] simpleBinarySearch(int[][] matrix, int row, int colStart, int colEnd, int target){
        //Searches in the given rows between the provided columns
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] searchIn2dArray(int[][] grid, int target){
        //Row-column matrix - it is in ascending order in terms of row and column.
        int row = 0, column = grid.length-1;//For nxn matrix

        while (row < grid.length && column>=0){
            if (grid[row][column]==target){
                return new int[] {row,column};
            }else if (grid[row][column] < target){
                row++;
            }else {
                column--;
            }
        }
        return new int[] {-1,-1};
    }
}
