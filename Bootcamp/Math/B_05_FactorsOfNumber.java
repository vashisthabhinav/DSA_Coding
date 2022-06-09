package Bootcamp.Math;

import java.util.ArrayList;
import java.util.Arrays;

public class B_05_FactorsOfNumber {
    public static void main(String[] args) {
        int n = 20;
        factors(n);
        factors1(n);
        factors2(n);
    }
    public static void factors(int n){
        for (int i = 1; i <=n ; i++) {
            //Brute Force Approach O(n) Time Complexity
            if (n%i==0){
                System.out.printf("%d is a factor of %d\n",i,n);
            }
        }
    }
    public static void factors1(int n){
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            //We are repeating some of the iterations
            //If 10*2 is 20, we need not check for 2*10
            //So, checking only till the square root of n
            //O(sqrt(n)) Time Complexity
            if (n%i==0){
                if (n/i == i){
                    //6*6 = 36, so we need not print it twice
                    System.out.println(i);
                }else {
                    System.out.println(i + ", " + n/i);
                }
            }
        }
    }
    public static void factors2(int n){
        //Printing in sorted order
        //Space Complexity O(sqrt(n)) Time Complexity O(sqrt(n))
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if (n%i==0){
                if (n/i == i){
                    //6*6 = 36, so we need not print it twice
                    System.out.println(i);
                }else {
                    System.out.println(i);
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.println(list.get(i));
        }
    }

}
