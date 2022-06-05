package Bootcamp.Math;

public class B_01_CountOdd {
    public static void main(String[] args) {
        int low = 81, high = 1001;
        System.out.println(countOdds(low,high));
        System.out.println(countOdds1(low,high));
    }
    public static int countOdds(int low, int high) {
        //Approach-1
        int i = low;
        int oddCount = 0;
        while (i<=high){
            if (i%2!=0){
                oddCount++;
                i++;
            }
            i++;
        }
        return oddCount;
    }
    public static int countOdds1(int low, int high) {
        /*
        0 <= low <= high <= 10^9
        Number of values to be checked for even and odd: high-low+1
        Eg - low = 3, high = 4 So, numbers = 5[3,4,5,6,7] i.e, 7-3+1
        If these numbers are even, then equal number of odds and evens will be present
        But if this number is odd, then we have to think
        There are four possibilities
        low is odd & high is even eg - 3,8 Range = 8-3+1 = 4 i.e, even
        low is odd & high is odd eg - 3,7 Range = 7-3+1 = 5 i.e., odd
        low is even and high is odd eg - 4,7 Range = 7-4+1 = 4 i.e., even
        low is even and high is even eg - 4,8 Range = 8-4+1 = 5 i.e., odd
         */
        int range = high-low+1;
        int oddNumbers = 0;
        if (range%2==0){
            oddNumbers = range/2;
        }else{
            if (low%2==0){
                //or high%2==0 will also give same result
                oddNumbers = range/2;
                //Odd numbers are one less than the even numbers.
                // So when we divide int by int the decimal part is removed and we get smaller value
                //5/2 = 2 i.e., ans
            }else {
                oddNumbers = (range/2)+1;
                //Odd numbers are one more than even numbers so adding 1
                //(5/2)+1 = 3
            }
        }
        return oddNumbers;
    }
}
