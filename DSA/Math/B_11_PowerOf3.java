package DSA.Math;

public class B_11_PowerOf3 {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(isPowerOfThree(num));
    }
    public static boolean isPowerOfThree(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        while (n!=3){
            if (n%3 != 0){
                return false;
            }
            n = n/3;
        }
        return true;
    }
}
