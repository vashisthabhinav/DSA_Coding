package Bootcamp.LinearSearch;

import java.util.Arrays;

public class B02_LinearSearchString {
    public static void main(String[] args) {
        String string = "Abhinav";
        char  target = 'n';
        System.out.println(LinearSearchChar(string,target));
        System.out.println(LinearSearchChar2(string,target));
        System.out.println(LinearSearchChar3(string,target));

        System.out.println(Arrays.toString(string.toCharArray()));
    }

    public static int LinearSearchChar(String string, char target) {
        if (string.length()==0){
            return -1;
        }
        for (int i = 0; i <string.length() ; i++) {
            if (string.charAt(i)==target) return i;
        }
        return -1;
    }
    public static boolean LinearSearchChar2(String string, char target) {
        if (string.length()==0){
            return false;
        }
        for (int i = 0; i <string.length() ; i++) {
            if (string.charAt(i)==target) return true;
        }
        return false;
    }
    public static boolean LinearSearchChar3(String string, char target) {
        if (string.length()==0){
            return false;
        }
        for (char ch:string.toCharArray()) {
            if (ch==target) return true;
        }
        return false;
    }
}
