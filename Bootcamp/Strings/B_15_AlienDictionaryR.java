package Bootcamp.Strings;

public class B_15_AlienDictionaryR {
    public static void main(String[] args) {
        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(isAlienSorted(words,order));
    }
    public static boolean isAlienSorted(String[] words, String order) {
        final int lenWord = 20;
        // create an order lookup
        int[] values = new int[26];
        for (int i = 0; i < order.length(); i++) {
            values[order.charAt(i) - 'a'] = i;
        }
        Boolean hasEqual = false;
        // compare index by index, not word by word
        // ex: return true if words[0][i] < words[1][i] .. < words[n][i]
        for (int i = 0; i < lenWord; i++) {
            // compare index i for all words
            for (int j = 0; j < words.length - 1; j++) {
                int value1 = i < words[j].length() ? values[words[j].charAt(i) - 'a'] : -1;
                int value2 = i < words[j + 1].length() ? values[words[j + 1].charAt(i) - 'a'] : -1;
                if (value1 > value2) { return false; }
                if (value1 == value2) { hasEqual = true;}
            }
            // when there is one equal in index i comparison at least, it has to compare index i + 1
            if (hasEqual) {
                hasEqual = false;
                continue;
            }
            return true;
        }
        return true;
    }
}
