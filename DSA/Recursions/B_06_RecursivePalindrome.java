package DSA.Recursions;

public class B_06_RecursivePalindrome {
    public static void main(String[] args) {
        int n = 123321;
        System.out.println(palindrome(n));
    }
    public static boolean palindrome(int n){
        return (n == rev(n));//Checking the reversed number with the original number for palindrome
    }
    public static int rev(int n){
        //Sometimes we might need some additional variables in the argument
        //In that case, make another function

        //1234 --> 4*1000 + 123
        //For taking this 1000 multiple, we need another function
        int digits = (int) (Math.log10(n) + 1);
        return helper(n , digits);
    }
    private static int helper(int n, int digits) {
        if (n%10 == n) return n;
        int rem = n%10;
        return (int) (rem * Math.pow(10,digits-1) + helper(n/10 , digits -1));
    }
}