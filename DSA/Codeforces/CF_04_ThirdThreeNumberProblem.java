package DSA.Codeforces;

import java.util.Scanner;

public class CF_04_ThirdThreeNumberProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < input; i++) {
            int n = Integer.parseInt(sc.nextLine());
            /*
            // Not optimized
            int a =1, b =1, c=1;
            if (n%2 != 0){
                System.out.println(-1);
            }else {
                while (c<n){
                    if (((a ^ b) + (b ^ c) + (a ^ c)) == n) {
                        System.out.println(a + " " + b + " " + c);
                        break;
                    }else {
                        c++;
                    }
                }
            }
             */
            //First and foremost, it can be proven that (a⊕b)+(b⊕c)+(a⊕c) is always even, for all possible non-negative values of a, b and c.
            //Therefore, if n is even, one possible solution is a=0, b=0 and c=n2
            if (n%2!= 0) System.out.println(-1);
            else System.out.println(0 + " " + 0 + " "+ n/2);
        }
    }
}

//if (((a ^ b) + (b ^ c) + (a ^ c)) == n) {