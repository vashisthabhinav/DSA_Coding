package DSA.HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class H_21_MigratoryBirds {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(migratoryBirds(list));
    }
    public static int migratoryBirds(List<Integer> arr) {
        int ans = 0;
        int[] count = new int[6];
        for (int i = 0; i < arr.size() ; i++) {
            count[arr.get(i)] += 1;
        }
        for (int i = 0; i <= 5 ; i++) {
            if (count[ans]<count[i]) ans = i;
        }
        return ans;
    }
}
