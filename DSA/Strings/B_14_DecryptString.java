package DSA.Strings;

public class B_14_DecryptString {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }
    public static String freqAlphabets(String str) {
        StringBuilder res = new StringBuilder();
        char[] s = str.toCharArray();
        int n = s.length;
        for (int i = 0; i < n; ++i) {
            if (i < n - 2 && s[i+2] == '#') {
                res.append((char)('j' + (s[i] - '1') * 10 + s[i+1] - '0'));
                i += 2;
            }
            else res.append((char)('a' + (s[i] - '1')));
        }
        return res.toString();
    }
}
