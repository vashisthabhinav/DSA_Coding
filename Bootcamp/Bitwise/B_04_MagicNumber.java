package Bootcamp.Bitwise;

public class B_04_MagicNumber {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(magicNumber(number));
    }

    public static int magicNumber(int number) {
        int magicNumber = 0;
        int base = 6;
        while (number>0){
            int lastDigit = number&1;
            magicNumber += lastDigit*base;
            base *= 5;
            number = number>>1;
        }
        return magicNumber;
    }
}
