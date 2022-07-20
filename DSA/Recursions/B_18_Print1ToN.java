package DSA.Recursions;
//https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1/#
public class B_18_Print1ToN {
    public static void main(String[] args) {
        int N = 10;
        printNos(N);
    }
    static int n = 1;
    public static void printNos(int N){
        System.out.print(n + " ");
        if(n!=N){
            n++;
            printNos(N);
        }
    }
}
