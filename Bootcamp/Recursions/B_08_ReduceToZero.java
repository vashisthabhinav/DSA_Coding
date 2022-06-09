package Bootcamp.Recursions;

public class B_08_ReduceToZero {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }
    public static int numberOfSteps(int num) {
        int steps = 0;
        return helper( num , steps);
    }
    public static int helper(int num, int steps) {
        if (num==0) return steps;
        if (num%2==0){
            return helper(num/2,steps+1);
        }else {
            return helper(num-1,steps+1);
        }
    }
}
/*
class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num!=0){
            if (num%2==0){//If the number is even, then dividing by 2.
                num = num/2;
                steps++;
            }else{//If the number is odd, then subtracting by 1
                num = num-1;
                steps++;
            }
        }
        return steps;
    }
}
 */