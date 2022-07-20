package DSA.GFG;

public class GFG_05_ProblemSetting {
    public static void main(String[] args) {
        int n = 10;
        int[] problems = {1 ,2 ,5 ,6 ,7 ,10 ,21 ,23 ,24 ,49};
        System.out.println(maximum_problems(n,problems));
    }
    public static int maximum_problems(int n, int[] problems) {
        int ans = 1;
        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            if (problems[i+1] <= 2 * problems[i] && problems[i+1] > problems[i]){
                count++;
            }else count = 1;
            ans = Math.max(count,ans);
        }
        return ans;
    }
}
