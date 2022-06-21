package DSA.Sorting;

public class B_10_MissingNumber {
    public static void main(String[] args) {
        int [] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
        System.out.println(missingNumber1(arr));
    }
    public static int missingNumber(int[] nums) {
//        Q268
        int missingNum = 0;
        //The range is from 0 to n, so the last number will be equal to the length of array
        int lastNum = nums.length;
        int sum = 0;
        // We are taking sum here because sum of 0 to n terms is [n*(n+1)] and we will get totalSum - the sum of our array.
        // So from here, we can find the missing number = totalSum - sum of our array
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int totalSum = (lastNum*(lastNum+1))/2;
        missingNum = totalSum - sum;
        return missingNum;
    }
    public static int missingNumber1(int[] nums) {
        //Using Cyclic Sort
        /*
        Numbers are from 0 till N --> Total numbers will be N+1 numbers
        {0,1,2,3} In the sorted version, element==index
        */
        int i = 0;
        while (i<nums.length){
            int correct = nums[i];//Index = value
            if (nums[i] < nums.length && nums[correct] != nums[i]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        //Search for first missing number
        for (int j = 0; j < nums.length ; j++) {
            if (nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }
    public static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
