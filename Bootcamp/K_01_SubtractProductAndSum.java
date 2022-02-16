package Bootcamp;

public class K_01_SubtractProductAndSum {
    public static int subtractProductAndSum(int n) {

        int difference = 0;
        int sum = sum(n);
        int product = product(n);
        difference = product-sum;
        return difference;
    }

    public static int product(int n) {
        int product = 1;
        while (n>0){//For product
            //Taking number at the last index
            int digit = n%10;
            // Adding it to the sum

            product = product*digit;
            //To check for the next value, removing the digit at ones place
            n = n/10;
        }
        return product;
    }

    public static int sum(int n) {
        int sum = 0;

        while (n>0){//For sum
            //Taking number at the last index
            int digit = n%10;
            // Adding it to the sum
            sum = sum+digit;
            //To check for the next value, removing the digit at ones place
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }
}
