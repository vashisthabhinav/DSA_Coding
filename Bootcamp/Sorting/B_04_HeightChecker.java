package Bootcamp.Sorting;

public class B_04_HeightChecker {
    public static void main(String[] args) {
        int [] heights = {5,1,2,3,4};
        System.out.println(heightChecker(heights));
    }
    public static int heightChecker(int[] heights) {
        //Q-1051

        //Brute force approach
        //Making a new array and copying the given heights array in it
        //Then sorting the heights array using bubble sort
        //Then comparing the two arrays for differences
        int difference = 0;
        int [] original = new int[heights.length];
        for (int i = 0; i < original.length ; i++) {
            original[i] = heights[i];
        }
        for (int i = 0; i < heights.length ; i++) {
            for (int j = 1; j < heights.length - i ; j++) {
                if (heights[j-1] > heights[j]){
                    int temp = heights[j];
                    heights[j] = heights[j-1];
                    heights[j-1] = temp;
                }
            }
        }
        for (int i = 0; i <original.length ; i++) {
            if (original[i] != heights[i]) difference++;
        }
        return difference;
    }
}
