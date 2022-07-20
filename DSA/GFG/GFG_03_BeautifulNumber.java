package DSA.GFG;

public class GFG_03_BeautifulNumber {
    public static void main(String[] args) {
        System.out.println(beautifulNumber(19));
    }
    public static boolean beautifulNumber(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while (fast != slow);
        if (slow==1) return true;
        else return false;
    }
    public static int findSquare(int num){
        int ans = 0;
        while (num>0){
            int rem = num%10;
            ans += rem*rem;
            num = num/10;
        }
        return ans;
    }
}
