package DSA.HackerRank;

import java.util.List;

public class H_09_LonelyInteger {
    public static void main(String[] args) {

    }
    public static int lonelyinteger(List<Integer> a) {
        //Bitwise Operation
        int unique = 0;
        for(int i = 0 ; i < a.size() ; i++){
            unique ^= a.get(i);//XOR Operator
        }
        return unique;
    }
}
