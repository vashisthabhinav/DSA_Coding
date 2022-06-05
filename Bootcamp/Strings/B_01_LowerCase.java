package Bootcamp.Strings;

public class B_01_LowerCase {
    public static void main(String[] args) {
        System.out.println(toLowerCase("Abhinav Vashisth"));
        System.out.println(toLowerCase1("Abhinav Vashisth"));
    }

    public static String toLowerCase1(String s) {
        //ASCII char A starts from 65 and a from 97 (+32)
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length() ; i++) {
            ch[i] = s.charAt(i);
        }
        for (int i = 0; i < ch.length ; i++) {
            if (ch[i] >='A' && ch[i]<='Z'){
                ch[i] +=32;
            }
        }
        return String.valueOf(ch);
    }

    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }
}
