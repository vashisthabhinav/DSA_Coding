package Bootcamp.Math;

public class B_07_HappyNumber {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        boolean ans = check(n,1);
        return ans;
    }
    public static boolean check(int n, int iter){
        if (iter>7) return false;//Checking for 7 iterations
        if (n==1) return true;
        int value;
        int sum = 0;
        while (n>0){
            value = n%10;
            sum += value*value;
            n = n/10;
        }
        return check(sum,iter+1);
    }
}
