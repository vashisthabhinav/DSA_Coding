package Beginner.DailyChallange;

public class LC_01_Q191 {
    public static void main(String[] args) {
       int n = 00000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n) {
        int ans=0;//Number of '1' bits a number has
        while(n!=0){
            n=n&(n-1);//It's figuring out if n is either 0 or an exact power of two
            ans++;
        }
        return ans;
    }
}
/*
As a Relational Operator: & is used as a relational operator to check a conditional statement just like && operator.
Both even give the same result, i.e. true if all conditions are true, false if any one condition is false.
However, there is a slight difference between them, which highlights the functionality of & operator:
    && operator: It only evaluates the next condition, if the condition before it is true.
    If anyone condition is false, it does not evaluate the statement any further.
    & operator: It evaluates all conditions even if they are false.
    Thus, any change in the data values due to the conditions will only be reflected in this case.
 */