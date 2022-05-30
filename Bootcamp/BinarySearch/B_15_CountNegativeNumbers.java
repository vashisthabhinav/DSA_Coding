package Bootcamp.BinarySearch;

public class B_15_CountNegativeNumbers {
    //Q1351
    public static void main(String[] args) {
        int [] [] grid = { {-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
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
}
