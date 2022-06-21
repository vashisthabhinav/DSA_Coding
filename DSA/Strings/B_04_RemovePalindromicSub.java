package DSA.Strings;

public class B_04_RemovePalindromicSub {
    public static void main(String[] args) {
        String s = "ababb";
        System.out.println(removePalindromeSub(s));
    }
    public static int removePalindromeSub(String s) {
        //Q1332
        //There are two possibilities in this question.
        //If the entire string is a palindrome, return 1 as it can be eliminated one
        //Or in the other case, just eliminated all the 'a' first and then 'b' afterwards. And return the ans 2
        int n = s.length();
        //A string is called palindrome if is one that reads the same backward as well as forward.
        boolean isPalindrome = false;
        for (int i = 0; i <n/2 ; i++) {
            if (s.charAt(i) == s.charAt(n-i-1)){
                isPalindrome = true;
            }else{
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            return 1;
        }
        else{
            return 2;
        }
    }
}
