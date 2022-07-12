package DSA.InterViewBit;

import java.util.*;

public class IB_02_CountClans {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(69);
        list.add(18);
        list.add(23);
        list.add(84);
        list.add(27);
        list.add(14);
        list.add(87);
        list.add(87);
        list.add(21);
        list.add(54);
        list.add(91);
        list.add(43);
        list.add(42);
        list.add(64);
        list.add(65);
        System.out.println(solve(list));
    }
    public static int solve(ArrayList<Integer> A) {
        int ans = 1;
        int divisor;
        int n = A.size();
        int[] primes = new int[n];
        Arrays.fill(primes, 1);
        for (int i = 0; i < n; i++) {
            int prime = 0;
            int dividend = A.get(i);
            divisor = 2;
            while (divisor<=dividend){
                if (dividend%divisor == 0){
                    prime++;
                    primes[i] *= divisor;
                }
                //Calculating next prime number
                divisor = checkNextDivisor(divisor);
            }
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < primes.length; i++) {
            map.put(primes[i],map.getOrDefault(primes[i],0)+1);
        }
        for (int val:map.values()) {
            ans *= val;
        }
        return ans;
    }

    private static int checkNextDivisor(int n) {
        n++;
        boolean ans = false;
        while (!ans){
            for (int i = 2; i < n; i++) {
                if (n%i==0){
                    n++;
                    i = 1;
                }
            }
            ans = true;
        }
        return n;
    }
}
