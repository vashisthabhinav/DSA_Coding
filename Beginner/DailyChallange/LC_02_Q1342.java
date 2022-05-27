package Beginner.DailyChallange;

public class LC_02_Q1342 {
    public static void main(String[] args) {
        int num = 0;//The number cannot be negative as per the question.
        System.out.println(numberOfSteps(num));
    }
    public static int numberOfSteps(int num) {
        int steps = 0;
        if (num==0){
            return 0;
        }
        while (num!=0){
            if (num%2==0){
                num = num/2;
                steps++;
            }else{
                num = num-1;
                steps++;
            }
        }
        return steps;
    }
}
