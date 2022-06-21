package DSA.Recursions;

public class B_11_RotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums = {5,6,7,8,9,1,2,3,4};
        int target = 3 , start = 0 , end = nums.length-1;
        System.out.println(rotatedBinarySearch(nums,target,start,end));
    }

    static int rotatedBinarySearch(int[] nums, int target, int start, int end) {
        if (start>end) return -1;

        int mid = start + (end-start)/2;
        if (nums[mid]==target) return mid;
        if (nums[start] <= nums[mid]){
            //It means that the first half is sorted
            //Now searching int this part of the array
            if (target>=nums[start] && target<=nums[mid]){
                //Means that the target lies in the sorted part of the array
                //checking in the first half
                return rotatedBinarySearch(nums,target,start,mid-1);
            }else{
                //Target does not lie in the first half so checking in the second half
                return rotatedBinarySearch(nums,target,mid+1,end);
            }
        }else{
            //The first half of the array is not sorted
            if (target>=nums[mid] && target<= nums[end]){
                //Target lies in the second half
                return rotatedBinarySearch(nums,target,mid+1,end);
            }else{
                return rotatedBinarySearch(nums,target,start,mid-1);
            }
        }
    }

}
