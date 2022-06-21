package DSA.BinarySearch;

public class B_08_02_SearchInArrayWithDuplicates {
    //Search in Rotated Sorted Arrays with duplicate values
    public static boolean search(int[] nums, int target) {

        int start = 0, end = nums.length-1;
        int pivotIndex = -1;
        int targetIndex;
        if (nums.length==1){
            if (nums[start]==target) return true;
            else return false;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if (mid<end && nums[mid]>nums[mid+1]){
                // if the mid is the end element in one case, then mid+1 will give ArrayOutOfBoundsException
                // Thus mid<end
                pivotIndex = mid;
            }
            if (mid>start && nums[mid]<nums[mid-1]) {
                // if the mid is the start element in one case, then mid-1 will give ArrayOutOfBoundsException
                // Thus mid>start
                pivotIndex = mid-1;
            }
//            if (nums[start]>=nums[mid]) {
//                end = mid-1;
//            }else{
//                start = mid+1;
//            }//This will be different from the rotated sorted array with non-duplicate values because this cannot be applied directly

//            If the elements at middle, start, and end are same then we have to skip the start and the end values and move onto the next values of start and end.
//            start = start+1; end = end-1;

            if (nums[mid]==nums[start] && nums[mid]==nums[end]){
//                First checking if the element at start is the pivot of the array
                if (nums[start]>nums[start+1]){
                    pivotIndex = start;
                }
                start++;
//                Then checking if the element at end is the pivot of the array
                if (nums[end-1]>nums[end]){
                    pivotIndex = end-1;
                }
                 end--;
            }
            else if (nums[start]<nums[mid] || (nums[start]==nums[mid] && nums[mid]>nums[end])){
                //Now if the start element at start is smaller than middle, we know that the left part of the array is sorted, and we have to just look in the right side.
                // There is another possibility however that the start=mid(elements) so, in this case we will check whether middle element is greater than the end element which would mean that pivot will lie somewhere between the middle and end
                // So if either of the conditions is true, we will look in the right side of the array.
                start = mid +1;
            }else {
                end = mid -1;
            }
        }
        if (pivotIndex==-1){
            //Normal Binary Search as the array is not rotated
            targetIndex = binarySearch(nums,0,nums.length-1,target);
        }else{
            //Checking in the first half
            targetIndex = binarySearch(nums,0, pivotIndex, target);
            if (targetIndex==-1){
                targetIndex = binarySearch(nums,pivotIndex+1,nums.length-1, target);
            }
        }
        if (targetIndex !=-1){
            return true;
        }else {
            return false;
        }
    }
    public static int binarySearch(int[] arr,int start, int end, int target){
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
        int [] arr = {3,1};
        int target  = 0;
        System.out.println(search(arr,target));
    }
}
