package DSA.Math;

public class B_02_PrimeNumber {
    public static void main(String[] args) {
        int n = 40;
        for (int i = 0; i <= n ; i++) {
            System.out.println(i + " is prime: " + isPrime(i));
        }

    }
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c = 2;
        while (c*c <= n){
            //Only check till sqrt(n) because after that, the numbers are repeated
            if (n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }


}
