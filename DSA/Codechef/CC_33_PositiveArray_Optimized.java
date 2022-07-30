package DSA.Codechef;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CC_33_PositiveArray_Optimized {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int count = 1;
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            }
            int first = arr[0];
            int last = arr[N-1];
            while (first <= last){
                if (map.containsKey(first)){
                    if (map.get(first)>= first) {
                        count = map.get(first);
                    }
                }
                first++;
            }
            System.out.println(count);
            T--;
        }
    }
}
