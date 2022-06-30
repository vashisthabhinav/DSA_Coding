package DSA.HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class H_20_SalesByMatch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(10);
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(10);
        list.add(20);
        int n = 9;
        System.out.println(sockMerchant(n,list));
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(ar.get(i),map.getOrDefault(ar.get(i),0)+1);
        }
        for (int i = 0; i < n; i++) {
            int noOfSocks = map.get(ar.get(i));
            if (noOfSocks>1){
                ans++;
                map.put(ar.get(i),noOfSocks-2);
            }
        }
        return ans;
    }
}
