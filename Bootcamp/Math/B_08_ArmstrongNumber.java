package Bootcamp.Math;

public class B_08_ArmstrongNumber {
    public static void main(String[] args) {
        int n = 3791;
        System.out.println(armstrongNumber(n));
    }
    static String armstrongNumber(int n){
        int number = n;
        int val;
        int sum = 0;
        while (n>0){
            val = n%10;
            sum += val*val*val;
            n = n/10;
        }
        if (sum == number){
            return "Yes";
        }else return "No";
    }
}
