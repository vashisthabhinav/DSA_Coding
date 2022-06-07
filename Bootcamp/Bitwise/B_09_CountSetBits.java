package Bootcamp.Bitwise;

public class B_09_CountSetBits {
    public static void main(String[] args) {
        int n = 89;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
        System.out.println(setBits1(n));
    }
    public static int setBits(int n){
        int setBits = 0;
        while (n>0){
            if ((n&1)==1) setBits++;
            n = n>>1;
        }
        return setBits;
    }
    public static int setBits1(int n){
        int count = 0;
        while (n!=0){
            count++;
//            n = n - (n&(-n));
            n = n&(n-1);
        }
        return count;
    }
}
