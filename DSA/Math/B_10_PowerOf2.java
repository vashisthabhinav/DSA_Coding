package DSA.Math;

public class B_10_PowerOf2 {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        while (n!=2){
            if (n%2 != 0){
                return false;
            }
            n = n/2;
        }
        return true;
    }
}
