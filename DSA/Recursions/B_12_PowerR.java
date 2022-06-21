package DSA.Recursions;

public class B_12_PowerR {
    public static void main(String[] args) {
        int n = 8920;
        double x = 2;
        System.out.println(myPow(x,n));
        System.out.println(myPow1(x,n));
    }
    public static double myPow(double x, int n) {
        //Brute force method
        double pow = 1;
        if (n==0 || x==1) return 1;
        if (n<0){
            n = -n;
            x = 1/x;
        }
        if (n%2==0){
            //n is even
            return myPow(x*x, n/2);
        }else{
            //n is odd
            return x*myPow(x*x, n/2);
        }
    }
    public static double myPow1(double x, int n) {
        double ans = 1;
        if (n<0){
            n = -n;
            x = 1/x;
        }
        while (n>0){
            if ((n&1)==1) {
                ans *= x;
            }
            n = n>>1;
            x = x*x;
        }
        return  ans;
    }
    public static double myPow2(double x, int n) {
        //Does not give error
        double ans = 1;
        long absN = Math.abs((long)n);
        while(absN > 0) {
            if((absN&1)==1) ans *= x;
            absN >>= 1;
            x *= x;
        }
        return n < 0 ?  1/ans : ans;
    }
}
