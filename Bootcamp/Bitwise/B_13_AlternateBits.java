package Bootcamp.Bitwise;

public class B_13_AlternateBits {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(hasAlternatingBits(n));
    }
    public static boolean hasAlternatingBits(int n) {
        //Q693
        boolean ans = true;
        int prevBit = n&1;
        while (n>0){
            n = n>>1;
            int currentBit = n&1;
            if (prevBit==currentBit){
                ans = false;
            }
            prevBit = currentBit;
        }
        return ans;
    }
}
