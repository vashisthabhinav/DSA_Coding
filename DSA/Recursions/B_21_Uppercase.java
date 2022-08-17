package DSA.Recursions;

public class B_21_Uppercase {
    public static void main(String[] args) {
        String str = "geeAksforgeeKs";
        System.out.println(firstUpperCase(str));
    }
    public static char firstUpperCase(String string){
        return helper(string,0);
    }
    public static char helper(String string, int index) {
        if (index==string.length()) return '0';
        if (string.charAt(index)>=65 && string.charAt(index)<=90){
            return string.charAt(index);
        }else return helper(string,++index);
    }
}