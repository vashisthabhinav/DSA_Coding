package DSA.HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class H_02_MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        miniMaxSum(arr);
    }
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        long minSum = 0 , maxSum = 0;
        for(int i = 0 ; i < arr.size()-1 ; i++){
            minSum += arr.get(i);
        }
        for(int i = 1 ; i < arr.size() ; i++){
            maxSum += arr.get(i);
        }
        System.out.println(minSum + " " + maxSum);
    }
}
