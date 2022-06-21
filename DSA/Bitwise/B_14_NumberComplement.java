package DSA.Bitwise;

public class B_14_NumberComplement {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(findComplement(num));
    }
    public static int findComplement(int num) {
        //Q476
        //Ex for 5
        //Using XOR operator - 0-->1 and 1-->0 that is what we need(Complement)
        //101 ^ 111 = 010 i.e., the ans. 111 is the mask
        //For calculating mask, we take the value of highest one bit
        //5 = 101 in binary. Highest one bit = 100
        //If we left-shift this it will become 1000
        //1000 - 1 = 111 in binary that is the required mask
        int mask = (Integer.highestOneBit(num)<<1) - 1;
        return num ^ mask;
    }
}
