package DSA.Strings;

public class B_03_TwoStringsEquivalent {
    public static void main(String[] args) {
        String[] arr1 = {"ab", "cb"};
        String[] arr2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(arr1,arr2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        Q1662
        String s1 = "";
        for (int i = 0; i <word1.length ; i++) {
            s1 += word1[i];
        }
        String s2 = "";
        for (int i = 0; i <word2.length ; i++) {
            s2 += word2[i];
        }
        return s1.equals(s2);
    }
}
