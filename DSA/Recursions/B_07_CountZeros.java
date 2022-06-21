package DSA.Recursions;

public class B_07_CountZeros {
    public static void main(String[] args) {
        int n = 2040;
        System.out.println(noOfZeros(n,0));
    }
    public static int noOfZeros(int n, int count){
        if (n==0) return count;
        int rem = n%10;
        if (rem == 0) return noOfZeros(n/10,count+1);
        else return noOfZeros(n/10,count);
    }
}
