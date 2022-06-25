package DSA.HackerRank;

public class H_11_FlippingBits {
    public static void main(String[] args) {
        long n = 9;
        System.out.println(flippingBits(n));
    }
    public static long flippingBits(long n) {
        long res = 0L;//L important so that res is long type
        for(int i = 0; i < 32; i++){
            long mask = 1;
            mask = mask << i; // shift a bit to the respective position
            if((n & mask) == 0){ // check current bit is zero
                res = res | mask; // set current bit in result to one
            }
        }
        return res;
    }
}
