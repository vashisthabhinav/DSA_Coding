package Bootcamp.BinarySearch;

public class B_06_PositionOfElement {

    public static int positionOfElement(int [] arr, int target){
        /*
        In this question, it is given that the size of the array is infinite.
        So, arr.length cannot be applied as we don't know the size of the array.
        Instead, what we are doing is that we are checking for the element inside a small part of the array-
        If the number is not present we move onto the next part of the array and increase the length of the sub-part exponentially.
         */
        int index = -1;
        int start = 0;
        int end = 1;
        while (target>arr[end]){//If the target element is greater than the end, then it will definitely be greater than the start.
//            And if the target element is smaller than the start index as well, -1 will be returned straightaway as there is no potential answer.

            int newStart = end + 1;
            //Doubling the box value
            // end is equal to the previous end + sizeOfBox*2
            // size of box with indices 2-5 then the length is : 4
            // No of elements in a box are : end - (start-1) i.e., total elements - the elements already covered
            //      [5-{2+1}] = 4
            end = end + (end-start+1)*2;//Using the previous start in this case
            start = newStart;// Updating the start value for the next iteration after updating the formula.
        }
        index = binarySearch(arr, target,start,end);
        return index;
    }

    static int binarySearch(int[] arr,int target, int start, int end){
        if (arr.length==0) return -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target<arr[mid]) end = mid-1;
            else if (target>arr[mid]) start = mid+1;
            else return mid;//ans
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,8,9,12,34,67,89, 120, 129, 138, 156, 174,210};
        int target = 12;
        System.out.println(positionOfElement(arr,target));
    }
}
