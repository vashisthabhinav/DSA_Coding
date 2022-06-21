package DSA.Recursions;

public class B_05_ReverseNumber {
    public static void main(String[] args) {
        int n = 4281;
        reverse1(n);
        System.out.println(sum);
        System.out.println(reverse2(n));
        System.out.println(reverse3(n));
    }
    static int sum = 0;
    public static void reverse1(int n){
        if (n==0) return;
        int remainder = n%10;
        sum = sum*10 + remainder;
        reverse1(n/10);
    }
    public static int reverse2(int n){
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
    public static int reverse3(int n){
        if (n%10==n) return n;
        int digits = (int) (Math.log10(n) + 1);
        int rem = n%10;
        return (int) ( (rem*Math.pow(10,digits-1)) + reverse3(n/10) );
    }
}
