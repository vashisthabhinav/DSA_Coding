package Bootcamp.BinarySearch;

public class B_15_CountNegativeNumbers {
    //Q1351
    public static void main(String[] args) {
        int [] [] grid =
                {
                        { 5, 4, 3, 1},
                        { 4, 3, 2,-1},
                        { 3, 2, 1,-1},
                        { 1, 1,-1,-2},
                        {-1,-1,-2,-3}
                };
        System.out.println(countNegatives(grid));
        System.out.println(countNegatives1(grid));
    }
    public static int countNegatives(int[][] grid) {
        // O(nlogn) time complexity
        int negativeNumbers = 0;
        for (int i = 0; i < grid.length ; i++) {
            //Checking for each and every sub-array one by one
            negativeNumbers += binarySearch(grid[i]);//Adding negatives of each of the sub-arrays to get the final answer
        }
        return negativeNumbers;//Total number of negative numbers in the grid
    }

    public static int binarySearch(int[] ints) {
        int start = 0, end = ints.length-1, mid, negatives = 0;//neagtives are the negative numbers in the current sub-array
        while (start<=end){
            mid = start + (end-start)/2;
            if (ints[mid]<0){//If the element at mid is less than 0
                negatives += end - (mid-1);//It means that each and every element on the right side of the array will be negatives
                //So adding them into the negatives
                end = mid - 1;//Now, checking whether there are other numbers that are less than zero on the left part of the array
            }else{//If the element at mid is non-negative, it means that there are no non-negative numbers on the left side of the decreasing sub-array
                start = mid+1;//So, checking on the right side of the sub-array for negative numbers
            }
        }
        return negatives;//Total negatives of the sub-array returned to be added into total negative numbers present in the grid
    }
    public static int countNegatives1(int[][] grid) {
        // O(n) time complexity
        //This is a row-column 2D matrix --> It decreases row-wise and column wise
        //If the value is negative at any place, then the values of the other elements in the same column below that element will also be negative
        // So all the values till the end column can be added to the column, and we can shift towards the left column -->column--
        //And if the value is positive then all the values of the rows before that element on the left side will also be positive
        // so all those values can be ignored and straightaway we can move onto the next row --> row++
        int negativeCount = 0, row = 0, col = grid[0].length-1;

        while (row<grid.length && col>=0){
            if (grid[row][col]<0){
                //It means that it is a negative value and every integer in the same column following this element(below) will be negative
                negativeCount += grid.length - row;//This will give the number of rows that are below that element in the same column
                col--;//Now checking for the column on the left part of the matrix
            }else{
                //It means that the current element is non-positive and all the elements left to teh same row will be greater than the current element
                // So, they all will be positive as well so ignoring the row and checking for the negatives in the next row
                row++;//
            }
        }
        return negativeCount;
    }
}
