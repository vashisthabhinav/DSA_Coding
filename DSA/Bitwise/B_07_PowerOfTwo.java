package DSA.Bitwise;

public class B_07_PowerOfTwo {
    public static void main(String[] args) {
        int n = 132;
        System.out.println(powerOf2(n));
        System.out.println(powerOf_2(n));
    }
    public static boolean powerOf2(int n){
        if (n ==0) return false;
        if ((n&n-1)==0){
            return true;
        }else return false;
    }
    public static boolean powerOf_2(int n){
        int countOfOne = 0;
        while (n>0){
            n = n>>1;
            if ((n&1)==1) countOfOne++;
        }
        if (countOfOne==1) return true;
        return false;
    }
}
