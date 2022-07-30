package DSA.Codechef;

import java.util.*;

public class CC_37_HighFrequency {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                map.put(A[i], map.getOrDefault(A[i],0)+1);
            }
            ArrayList<Integer> list = new ArrayList<>();
            for (int value: map.values()) {
                list.add(value);
            }
            if (list.size()==1) list.add(1);
            Collections.sort(list);
            int first = list.get(list.size()-1);
            int second = list.get(list.size()-2);
            if (first%2==0){
                first = first/2;
            }else first = first/2 +1;
            if (first>second) System.out.println(first);
            else System.out.println(second);
            T--;
        }
    }
}
