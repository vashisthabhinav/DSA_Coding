package Bootcamp;

public class K_02_11APeakElement {
    public static void main(String[] args) {
        int [] arr = {0,10,5,2};
        System.out.println(findPeakElement(arr));
    }
    static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if (arr[mid]>arr[mid+1]){
                /*
                This is the decreasing part of the array. This may be the ans, but looking at the left. That's why, end != mid-1
                 */
                end = mid;
            }
            else{
                // This is the ascending part of the array.
                start = mid+1;//Because we know that mid+1 elements > mid element
            }
        }
        /*
        In the end, start == end and pointing to the largest number because of the two checks above.
        Start and end are always trying to find max element in the above 2 checks.
        Hence, when they are pointing to just one element, that is the max one because that is what the checks say.
        More elaboration: At every point of time for start and end, they have the best possible answer till that time.
        And if we are saying that only one item is remaining, coz of the above line that is the best possible answer
         */
        return start; //or return end as both are same
    }
}
