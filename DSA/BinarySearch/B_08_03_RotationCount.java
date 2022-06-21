package DSA.BinarySearch;

public class B_08_03_RotationCount {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2,3};
        System.out.println(count(arr));
    }

    public static int count(int[] nums) {
        int start = 0, end = nums.length-1;
        int pivotIndex = -1;
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
            if (nums[start]>=nums[mid]) {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return pivotIndex+1;
        // The number of rotations of the array are just equal to the pivot index +1
    }
}
