package Beginner.Arrays;

public class AR_02_NumberWithEvenNoOfDigits {
    public static int findNumbers(int[] nums) {
        int noOfEvenNumbers=0;
        for (int i =0; i< nums.length;i++){
            int number=nums[i];
            int digits=0;//To calculate how many digits are present in the numbers

            while (number!=0){
                number = number/10;
                digits++;
                /*
                Till the remainder will not come to 0, this loop will keep on running.
                When number(which is continuously getting divided by 10) reaches 0, we will automatically get the number of digits in the specified number.
                 */
            }
            if (digits%2==0){
                //To check whether the digits are even or odd, we divide them by 10
                noOfEvenNumbers++;
            }
        }
        return noOfEvenNumbers;
    }

    public static void main(String[] args) {
        int nums[] = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
}
