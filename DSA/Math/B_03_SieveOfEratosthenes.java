package DSA.Math;

public class B_03_SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];//array is filled with false initially
        sieve(n,primes);
    }
    //false in array means that the number is prime
    public static  void sieve(int n , boolean[] primes ){
        //Sieve of Eratosthenes
        // Auxiliary space or the space-time complexity O(n)
        //Time complexity n/2(Numbers divisible by 2) + n/3(Numbers divisible by 3) + n/5(Numbers divisible by 5) + n/7
        //n(1/2 + 1/3 + 1/5......) = n*(log(log n))
        for (int i = 2; i*i <= n ; i++) {
            if (!primes[i]) {
                for (int j = i*2; j <= n ; j+=i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if (!primes[i]) System.out.print(i+", ");
        }
    }
}
