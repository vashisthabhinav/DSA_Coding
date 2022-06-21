package DSA.Bitwise;

public class B_06_PascalTriangle {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(pascalTriangle(n));
        System.out.println(pascalTriangle1(n));
    }
    public static int pascalTriangle(int n){
        return 1<<(n-1);
    }
    public static int pascalTriangle1(int n){
        return (int) Math.pow(2,n-1);
    }
}
