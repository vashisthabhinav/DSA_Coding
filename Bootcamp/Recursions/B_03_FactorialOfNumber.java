package Bootcamp.Recursions;

public class B_03_FactorialOfNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        if (n==1) return 1;
        int factorial = n*factorial(--n);//--n means first decrement n by one then pass it.
        //n-- will give stack overflow error,
        // as first n will be passed then subtracted but due to this everytime n only will be passed
        return factorial;
    }
}
