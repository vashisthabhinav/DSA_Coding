package DSA.Strings;

public class B_16_Asterisks {
    public static void main(String[] args) {
        String s = "yo|uar|e**|b|e***au|tifu|l";
        System.out.println(countAsterisks(s));
    }
    public static int countAsterisks(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='|'){
                int j = i;
                while (j<s.length()){
                    if (j!=i && s.charAt(j)=='|'){
                        i = j;
                        break;
                    }else{
                        j++;
                    }
                }
            }
            if (s.charAt(i) == '*'){
                ans++;
            }
        }
        return ans;
    }
}
