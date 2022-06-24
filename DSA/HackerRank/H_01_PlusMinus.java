package DSA.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class H_01_PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-1);
        plusMinus(arr);
    }
    public static void plusMinus(List<Integer> arr) {
        double positives = 0 , negatives = 0 , zeros = 0, n = arr.size();
        for(int i = 0 ; i < n ; i++){
            if(arr.get(i)==0) zeros++;
            else if(arr.get(i)>0) positives++;
            else negatives++;
        }
        positives /=n;
        zeros /=n;
        negatives /=n;
        System.out.printf("%.6f\n",positives);
        System.out.printf("%.6f\n",negatives);
        System.out.printf("%.6f\n",zeros);
    }
}
