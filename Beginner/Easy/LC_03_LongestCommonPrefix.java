package Beginner.Easy;


public class LC_03_LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            // For an empty array, there is no prefix so returning an empty string
            return "";
        }

        String prefix = strs[0];
        // Creating a string to return the prefix. Initially, string at index 0 is taken as prefix and then checked inside the loops.
        for(int i =1 ; i < strs.length; i++){
            //Traversing the array with strings from index no = 1
            while(strs[i].indexOf(prefix) != 0)
                //Will exit the loop when we get the prefix.
                // The indexOf() method returns the position of the first occurrence of specified character(s) in a string.
                prefix = prefix.substring(0,prefix.length()-1);
                //Returns a new string object containing the prefix.
                //The prefix will keep on decreasing from the backside until it is common to the string at the index i.
        }
        return prefix;
    }

    public static void main(String[] args) {
        String []StringsArray = {"flower","flow","flight"};
        for (String x:StringsArray) {
            System.out.println(x);
        }
        String result = longestCommonPrefix(StringsArray);
        if (result.length() > 0) {
            System.out.println("The longest common prefix is: " + result);
        } else {
            System.out.println("There is no common prefix");
        }
    }
}
