package Bootcamp.Bitwise;

public class B_05_NumberOfDigits {
    public static void main(String[] args) {
        int number = 6786979;
        int base = 10;
        System.out.println(noOfDigits(number,base));
    }

    public static int noOfDigits(int number, int base) {
        int noOfDigits = (int) (( Math.log(number)/Math.log(base) ) +1);
        return noOfDigits;
    }
}
