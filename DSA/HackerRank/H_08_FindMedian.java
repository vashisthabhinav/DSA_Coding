package DSA.HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class H_08_FindMedian {
    public static void main(String[] args) {
     List<Integer> list = new ArrayList<>();
        list.add(5);
     System.out.println(findMedian(list));
    }
    public static int findMedian(List<Integer> arr) {
        // Write your code here
        if (arr.size()==0) return -1;
        Collections.sort(arr);
        int n = arr.size();
        return arr.get(n / 2);
    }
}
