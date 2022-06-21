package DSA.Bitwise;

public class B_10_RangeXOR {
    public static void main(String[] args) {
        int n = 9;
        int a = 3;
        System.out.println(XORFrom0ToN(n));
        System.out.println(XORFromAToN(n,a));
    }
    public static int XORFrom0ToN(int n){
        int ans;
        if (n%4==0) ans = n;
        else if (n%4==1) ans = 1;
        else if (n%4==2) ans = n+1;
        else ans = 0;
        return ans;
    }
    public static int XORFromAToN(int n, int a){
        int ans = XORFrom0ToN(n) ^ XORFrom0ToN(a-1);
        return ans;
    }

}
