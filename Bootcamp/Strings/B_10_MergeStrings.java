package Bootcamp.Strings;

public class B_10_MergeStrings {
    public static void main(String[] args) {
        String w1 = "abc";
        String w2 = "pqrs";
        System.out.println(mergeAlternately(w1,w2));
    }
    public static String mergeAlternately(String word1, String word2) {
        String ans = "";
        int i = 0 , j = 0;
        while (i < word1.length() && j < word2.length()){
            ans += word1.charAt(i++);
            ans += word2.charAt(j++);
        }
        //If one pointer ends, so all the elements of the other string will be added in the end together
        while (i < word1.length()) {
            ans += word1.charAt(i++);
        }
        while (j < word2.length()) {
            ans += word2.charAt(j++);
        }
        return ans;
    }
}
