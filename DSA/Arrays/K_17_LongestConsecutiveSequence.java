package DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class K_17_LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] arr) {
        if (arr.length==0) return 0;
        Arrays.sort(arr);
        int ans = 1, count = 1, n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < n ; i++) {
            if (arr[i] != arr[i-1]) list.add(arr[i]);
        }
        int length = list.size();
        for (int i = 0; i < length-1; i++) {
            if (list.get(i)+1 == list.get(i+1)){
                count++;
            }else {
                count = 1;
            }
            ans = Math.max(count,ans);
        }
        return ans;
    }
}
