package DSA.HackerRank;

public class H_16_MarsExploration {
    public static void main(String[] args) {
        String s = "SOSOOSOSOSOSOSSOSOSOSOSOSOS";
        System.out.println(marsExploration(s));
    }
    public static int marsExploration(String s) {
        int ans = 0;
        StringBuilder window = new StringBuilder();
        int i = 0 , n = s.length() ;
        while (i<n){
            while (window.length()<3){
                window.append(s.charAt(i++));
            }
            if (window.charAt(0) != 'S') ans++;
            if (window.charAt(1) != 'O') ans++;
            if (window.charAt(2) != 'S') ans++;
            window.delete(0, window.length());
        }
        return ans;
    }
}
