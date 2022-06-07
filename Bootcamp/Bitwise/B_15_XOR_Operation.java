package Bootcamp.Bitwise;

public class B_15_XOR_Operation {
    public static void main(String[] args) {
        int n = 4 , start = 3;
        System.out.println(xorOperation(n,start));
        System.out.println(3^1);
    }
    public static int xorOperation(int n, int start) {
        int ans = start;//First Iteration
        n--;
        while (n>0){
            start +=2;
            ans ^= start;
            n--;
        }
        return ans;
    }
}
