package Bootcamp.Recursions;

public class B_01_FibonacciSeries {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(finonacci(n));
    }
    public static int finonacci(int n){
        if (n ==0){
            return 0;
        }else if (n==1){
            return 1;
        }
        //or
//        if (n<2) return n;
        int ans = finonacci(n-1) + finonacci(n-2);
        return ans;
    }
}