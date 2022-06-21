package DSA.LinearSearch;

public class B_04_EvenDigitsOptimized {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int [] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    public static boolean even(int num){
        int numOfDigits = digits(num);
        if(numOfDigits % 2 == 0){
            return true;
        }
        return false;
    }
    public static int digits(int num) {
        if(num < 0){
            num = (-1)*num;
        }
        return (int)(Math.log10(num)) +1;
        //This is the inbuilt function which can be used in Java
    }
}
