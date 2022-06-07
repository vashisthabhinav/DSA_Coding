package Bootcamp.Bitwise;

public class B_08_aToThePower_b {
    public static void main(String[] args) {
        int base = 3;
        int power = 6;
        System.out.println(power(base,power));
    }
    public static int power(int base, int power){
        int ans = 1;
        while (power>0){
            if ((power&1) == 1){
                ans *=base;
            }
            base *= base;
            power = power>>1;
        }
        return ans;
    }
}
