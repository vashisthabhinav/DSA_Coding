package DSA.Sorting;

public class B_15_FirstMissingPositive {
    public static void main(String[] args) {
        int [] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        //Q41

        //Using Cyclic Sort
        /*
        Numbers are from 0 till N --> Total numbers will be N+1 numbers
        {0,1,2,3} In the sorted version, element==index
        */
        int i = 0;
        while (i<nums.length){
            int correct = nums[i]-1;//Index = value
            if (nums[i]>= 1 && nums[i] <= nums.length && nums[correct] != nums[i]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        //Search for first missing number
        for (int j = 0; j < nums.length ; j++) {
            if (nums[j] != j+1){
                return j +1;
            }
        }
        return nums.length+1;
    }
    public static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
