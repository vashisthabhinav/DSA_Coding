package DSA.Strings;

public class B_12_FindTheDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abdce";
        System.out.println(findTheDifference(s,t));
    }
    public static char findTheDifference(String s, String t) {
        //Q389
        // sum unicode at 2 strings
        int sumS=0;
        for(int i=0;i<s.length();i++){
            sumS += s.codePointAt(i);
        }
        int sumT=0;
        for(int i=0;i<t.length();i++){
            sumT += t.codePointAt(i);
        }
        //calculate difference of them that will get me the new char
        int f = sumT-sumS;
        //return it converted from unicode to character stored in char array index  0
        return  Character.toString(f).toCharArray()[0] ;

    }
}
