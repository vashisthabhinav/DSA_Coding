package Bootcamp.Math;

public class B_04_SquareRoot {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.println(mySqrt(n,p));
        System.out.println(mySqrtNewtonRaphson(n));
    }
    public static double mySqrt(int n, int p){
        //O(log n)
        int start = 0;
        int end = n;
        double root = 0.0;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (mid*mid == n){
                root =  mid;
                break;
            }
            else if (mid*mid>n){
                end = mid-1;
            }
            else {
                start = mid +1;
            }
        }
        //For precision
        double increment = 0.1;
        for (int i = 0; i < p; i++) {
            while (root*root<=n){
                if (root*root <= n){
                    root += increment;
                }
            }
            root -= increment;
            increment /=10;
        }
        return root;
    }
    public static double mySqrtNewtonRaphson(double n){
         //root = (X + (N/X))/2 , error = |Root - X|
        //Assign X to N itself, then start a loop
        //If error> 1 --> Update the value of X
        // Time complexity  = O((log n) f(n)) where f(n) is the cost of calculating f(x)/f`(x)
        double x = n;
        double root;
        while (true){
            root = 0.5 * (x + (n/x));
            double error = Math.abs(root-x);
            if (error<0.1){
                break;
            }
            x = root;
        }
        return root;
    }

}
