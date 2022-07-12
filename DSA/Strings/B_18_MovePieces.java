package DSA.Strings;

import java.util.HashMap;

public class B_18_MovePieces {
    public static void main(String[] args) {
        String  start = "_L__R__R_", target = "L______RR";
        System.out.println(canChange(start,target));
    }
    public static boolean canChange(String start, String target) {
        int startL = 0 , startR = 0 , targetL = 0 , targetR = 0;
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i)=='L') startL++;
            if (start.charAt(i)=='R') startR++;
        }
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i)=='L') targetL++;
            if (target.charAt(i)=='R') targetR++;
        }
        if (startL != targetL || startR != targetR) return false;
        boolean ans= true;
        HashMap<Integer,Character> map = new HashMap<>();
        int index = 0;
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) != '_'){
                map.put(index,start.charAt(i));
                index++;
            }
        }
        index = 0;
        for (int i = 0; i < target.length(); i++) {
            char character = target.charAt(i);
            if ( character != '_'){
                if (map.get(index) != character){
                    return false;
                }else index++;
            }
        }
        int targetIndex = 0;
        for (int i = 0; i < start.length(); i++) {
            int startChar = start.charAt(i);
            if (startChar == 'L'){
                for (int j = 0; j < target.length(); j++) {
                    if (target.charAt(j)==startChar){
                        if (j>i) return false;
                        else targetIndex = j+1;
                    }
                }
            }
            if (startChar == 'R'){
                for (int j = targetIndex; j < target.length(); j++) {
                    if (target.charAt(j)==startChar){
                        if (j<i) return false;
                        else targetIndex = j+1;
                    }
                }
            }
        }
        return ans;
    }
}
