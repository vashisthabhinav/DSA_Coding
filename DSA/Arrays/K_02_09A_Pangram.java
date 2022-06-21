package DSA.Arrays;

import java.util.Arrays;

public class K_02_09A_Pangram {
    public static boolean checkIfPangram(String sentence) {
        boolean pangram = false;
        //Creating a character array og the string
        char[] characters = new char[sentence.length()];
        System.out.println(Arrays.toString(characters));
        for (int i = 0; i <sentence.length() ; i++) {
            boolean flag = true;
            for (int j = 0; j <sentence.length() ; j++) {
                if (sentence.charAt(i)==sentence.charAt(j) && i!=j){
                    flag = false;
                    break;
                }
            }
            if (flag){
                characters[i] = sentence.charAt(i);
            }
        }
        System.out.println(Arrays.toString(characters));
        int noOfCharacters = 0;

        return pangram;
    }
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
}
