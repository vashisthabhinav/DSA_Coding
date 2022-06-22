package DSA.Algorithms.SlidingWindow;

public class S_07_K_BeautyOfNumber {
    public static void main(String[] args) {
        int num = 430043, k = 2;
        System.out.println(divisorSubstrings(num,k));
    }
    public static int divisorSubstrings(int num, int k) {
        int ans = 0;
        String numString = Integer.toString(num);
        int i = 0 , j = 0 , n = numString.length();
        StringBuilder subString = new StringBuilder();
        while (j<n){
            subString.append(numString.charAt(j));
            if (j-i+1<k){
                j++;
            }else{
                String divisor = subString.toString();
                int d = Integer.parseInt(divisor);
                if (d>0 && num%d == 0){
                    ans++;
                }
                subString.deleteCharAt(0);
                i++;
                j++;
            }
        }
        return ans;
    }
}
