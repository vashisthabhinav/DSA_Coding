package Bootcamp.Bitwise;

public class B_01_OddEven {
    public static void main(String[] args) {
        int n = 78;
        boolean isOdd = isOdd(n);
        if (isOdd) {
            System.out.printf("The number %d is odd",n);
        }else{
            System.out.printf("The number %d is even",n);
        }
    }

    public static boolean isOdd(int n) {
        return (n&1)==1;
    }

}
