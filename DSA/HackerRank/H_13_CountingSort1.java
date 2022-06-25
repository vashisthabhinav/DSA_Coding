package DSA.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class H_13_CountingSort1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        System.out.println(countingSort(arr));
    }
    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> ans = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            ans.add(0);
        }
        for (int i = 0; i < arr.size(); i++) {
            int element = arr.get(i);
            ans.set(element,ans.get(element)+1);
        }
        return ans;
    }
}
