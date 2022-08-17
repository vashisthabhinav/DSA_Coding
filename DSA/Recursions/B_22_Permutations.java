package DSA.Recursions;

import java.util.ArrayList;

public class B_22_Permutations {
    public static void main(String[] args) {
        permutations("","abc");
        System.out.println(permutationsList("","abc"));
        System.out.println(permutationsCount("","abc"));
    }
    public static void permutations(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i);
            permutations(first+ch+second,unprocessed.substring(1));
        }
    }
    public static ArrayList<String> permutationsList(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i);
            ans.addAll(permutationsList(first+ch+second,unprocessed.substring(1)));
        }
        return ans;
    }
    public static int permutationsCount(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return 1;
        }
        char ch = unprocessed.charAt(0);
        int count = 0;
        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i);
            count += permutationsCount(first+ch+second,unprocessed.substring(1));
        }
        return count;
    }
}
