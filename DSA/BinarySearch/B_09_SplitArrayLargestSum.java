package DSA.BinarySearch;

public class B_09_SplitArrayLargestSum {
    public static void main(String[] args) {
        int [] arr = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(arr,m));
    }
    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length ; i++) {
            end += nums[i];//Total Sum of the whole array
            if (start<nums[i]) start = nums[i];//Largest number
        }
        //Binary search
        while (start<end){
            // Try for the middle as the potential ans
            int mid = start + (end-start)/2;
            // Calculate how many pieces you can divide an array into the sub-arrays
            int sum = 0;
            int pieces = 1;
            for (int num:nums) {//For every number in the nums array
                if (sum+num > mid){//If the current sum + this number is exceeding the mid(sum that is allowed to us)
                    //You cannot add this in the current sub-array, so make a new one
                    // Let us suppose we add this number in new subarray, then sum = num(current number)
                    sum = num;
                    pieces++;
                }else {
                    sum += num;
                }
            }
            if (pieces>m){
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return start;//start = end
    }
}
