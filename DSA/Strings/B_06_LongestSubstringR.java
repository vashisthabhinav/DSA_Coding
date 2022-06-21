package DSA.Strings;

import java.util.HashSet;
import java.util.Set;

public class B_06_LongestSubstringR {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring1(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, length = 0;
        Set<Character> uniqueChar = new HashSet<>();
        while (j < s.length()) {
            //Running the loop till we have checked each char of the array
            if (!uniqueChar.contains(s.charAt(j))) {
                //If a set does not contain the character at value j, it can be added into the set at j
                uniqueChar.add(s.charAt(j));
                j++;//Incrementing the value of j for the next iteration
                length = Math.max(length, uniqueChar.size());//Checking for the max length of the hashset that is to be returned
            } else {
                //Else we know that the character is already present in that set, so removing it from the set
                uniqueChar.remove(s.charAt(i));
                i++;//Incrementing the value of i for the next iteration
            }
        }
        return length;
    }
    public static int lengthOfLongestSubstring1(String string) {
        int index = 0,stringIndex = 0, length = 0;
        Set<Character> uniqueChar = new HashSet<>();
        while ( stringIndex < string.length() ) {
            if (uniqueChar.add(string.charAt(stringIndex))){
                //add method --> Adds the specified element to this set if it is not already present.
                length = Math.max(length, uniqueChar.size());//Changing the value of length and keeping record of maximum length
                stringIndex++;//
            }else{
                //Else if it is present then removing that element from the HashSet
                while (uniqueChar.contains(string.charAt(stringIndex))){
                    //Iterating the loop till char repeated character is not found
                    uniqueChar.remove(string.charAt(index));
                    index++;
                }
            }
        }
        return length;
    }
}
