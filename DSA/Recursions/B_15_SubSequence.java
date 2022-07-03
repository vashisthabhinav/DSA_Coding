package DSA.Recursions;

import java.util.ArrayList;

public class B_15_SubSequence {
    public static void main(String[] args) {
        subSeq("", "abc");
        System.out.println(subSeqList("","abc"));
    }

    static void subSeq(String processed , String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        subSeq(processed + ch , unprocessed.substring(1));
        subSeq(processed , unprocessed.substring(1));
    }
    static ArrayList<String> subSeqList(String processed , String unprocessed){
        if (unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> left = subSeqList(processed + ch , unprocessed.substring(1));
        ArrayList<String> right = subSeqList(processed , unprocessed.substring(1));
        left.addAll(right);
        return left;
    }
}
