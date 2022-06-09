package Bootcamp.Recursions;

public class B_04_Sum_Product_OfDigits {
    public static void main(String[] args) {
        int n = 4567;
        System.out.println(sumIterative(n));
        System.out.println(sumRecursive(n));
        System.out.println(prodRecursive(n));
    }
    public static int sumRecursive(int n){
        if (n==0) return 0;
        return n%10 + sumRecursive(n/10);
    }
    public static int sumIterative(int n){
        int sum = 0;
        while (n>0){
            int val = n%10;
            sum += val;
            n = n/10;
        }
        return sum;
    }
    public static int prodRecursive(int n){
        if (n%10==n) return n;//If one digit is remaining, then return that digit
        return n%10 * prodRecursive(n/10);
    }
}
