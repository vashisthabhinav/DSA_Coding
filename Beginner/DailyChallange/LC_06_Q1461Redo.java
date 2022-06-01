package Beginner.DailyChallange;

public class LC_06_Q1461Redo {
    public static void main(String[] args) {
        String s = "00110110";
        int k = 2;
        System.out.println(hasAllCodes(s,k));
    }
    public static boolean hasAllCodes(String s, int k) {
        int max = (int) Math.pow(2, k);
        if(s.length() < max)
            return false;
        int[] subs = new int[max];
        for (int i = 0; i <= s.length()-k; i++) {
            String t = s.substring(i, i+k);
            int in = Integer.parseInt(t,2);
            if(in < subs.length)
                subs[in] = 1;
            else
                return false;
        }
        for (int i = 0, j = subs.length-1; i < j; i++, j--)
            if(subs[i] != 1 || subs[j] != 1)
                return false;

        return true;
    }

}
