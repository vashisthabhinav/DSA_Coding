package Bootcamp.Math;

public class B_09_PowerOf4 {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(isPowerOfFour(n));
    }
    public static boolean isPowerOfFour(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        while (n!=4){
            if (n%4 != 0){
                return false;
            }
            n = n/4;
        }
        return true;
    }
}
