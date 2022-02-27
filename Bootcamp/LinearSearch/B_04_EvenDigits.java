package Bootcamp.LinearSearch;

public class B_04_EvenDigits {
    public static void main(String[] args) {
        int [] nums = {12, 34,555,67890,4321};
        System.out.println(findNums(nums));
    }
    static int findNums(int[] nums){
        int evenNoOfDigits = 0;
        for (int num: nums) {
            if (even(num)) evenNoOfDigits++;
        }
        return evenNoOfDigits;
    }

     static boolean even(int num) {
        //Function to check whether a number contains even no of digits or not
         String str = Integer.toString(num);
         int stringLength = str.length();
         if (stringLength%2==0) return true;
         return false;
    }
}
