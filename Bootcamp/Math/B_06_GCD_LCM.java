package Bootcamp.Math;

public class B_06_GCD_LCM {
    public static void main(String[] args) {
        int a = 4, b = 6;
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }
    public static int gcd(int a, int b){
        if (a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    public static int lcm(int a, int b){
        int hcf = gcd(a,b);
        return (a*b)/hcf;
    }
}
