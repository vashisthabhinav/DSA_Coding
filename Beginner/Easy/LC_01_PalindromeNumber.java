package Beginner.Easy;

import java.util.Scanner;

public class LC_01_PalindromeNumber {
    public static boolean isPalindrome1(int x){
        if (x<0){
            return false;
            //All negative numbers are not a palindrome.
        }
        int palindrome = x; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and the reverse of number is equal means
        // number is palindrome in Java
        if (x == reverse) {
            return true;
        }
        return false;
    }
    public static boolean isPalindrome2(int x){
        if (x < 0) {
            return false;
            //All negative numbers are not a palindrome.
        }
        // initialize how many zeros
        int div = 1;
        while (x / div >= 10) {
            div *= 10;
        }

        while (x != 0) {
            int left = x / div;
            int right = x % 10;

            if (left != right)
                return false;

            x = (x % div) / 10;
            div /= 100;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to check whether it is palindrome or not: ");
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        boolean a = isPalindrome2(x);
        if (a){
            System.out.println("Yes, it is a palindrome");
        }else {
            System.out.println("No, it is not a palindrome");
        }
    }
}
