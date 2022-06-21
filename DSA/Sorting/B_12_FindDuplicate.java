package DSA.Sorting;

public class B_12_FindDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
        System.out.println(findDuplicate1(arr));
    }
    public static int findDuplicate1(int[] nums) {
        int i = 0;
        while (i < nums.length){
            if (nums[i] != i+1){
                int correct = nums[i] - 1;//Correct index of the element (value - 1)
                if (nums[i] != nums[correct]){
                    swap(nums,i,correct);
                }else{
                    return nums[i];//We have found the ans
                }
            }else{
                i++;
            }
        }
        return -1;//No duplicates
    }

    public static int findDuplicate(int[] nums) {
        //Q287
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;//Correct index of the element (value - 1)
            if (nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        //Search for duplicate number
        for (int j = 0; j < nums.length ; j++) {
            if (nums[j] != j+1){
                return nums[j];
            }
        }
        return -1;
    }
    public static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
