package Bootcamp.Arrays;

public class K_13_2D_Matrix {
    public static void main(String[] args) {
        int[][] matrix =
                {
                        { 1, 3, 5, 7},
                        {10,11,16,20},
                        {23,30,34,60}
                };
        int target = 3;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rowStart = 0;
        int rowEnd = matrix.length-1;
        int colMid = (matrix[0].length-1)/2;
//        If only one row is there.
        if(rowEnd - rowStart < 1){
            return binarySearch(matrix[0],target,0,matrix[0].length-1);
        }
//        Otherwise, we will filter 2 rows first where there is a probability to find the target.
        while(rowEnd - rowStart > 1){
            int rowMid = rowStart + (rowEnd - rowStart)/2;
            if(matrix[rowMid][colMid] == target){
                return true;
            }
            else if(matrix[rowMid][colMid] < target){
                rowStart = rowMid;
            }else{
                rowEnd = rowMid;
            }
        }
//        Now we have 2 rows left. Search in those 2 rows.
        if(binarySearch(matrix[rowStart],target,0,matrix[rowStart].length-1)){
            return true;
        }
        if(binarySearch(matrix[rowEnd],target,0,matrix[rowEnd].length-1)){
            return true;
        }

        return false;
    }

    static boolean binarySearch(int [] nums , int target , int start, int end){
        while(start <= end){
            int mid = start +(end - start)/2;
            if(nums[mid] == target){
                return true;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
}
