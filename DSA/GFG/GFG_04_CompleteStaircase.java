package DSA.GFG;

public class GFG_04_CompleteStaircase {
    public static void main(String[] args) {
        System.out.println(completeRows(8));
    }
    public static int completeRows(int n) {
        int ans = 0;
        int x = 1;
        while (n>0){
            n -= x;
            x++;
            ans++;
            if (n<0) ans--;
        }
        return ans;
    }
}
