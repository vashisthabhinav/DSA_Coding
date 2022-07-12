package DSA.Codechef;

import java.util.HashMap;
import java.util.Scanner;

public class CC_08_GroupAssignment {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T>0){
            int N = sc.nextInt();
            int[] P = new int[N];
            for (int i = 0; i < N; i++) {
                P[i] = sc.nextInt();
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                map.put(P[i],map.getOrDefault(P[i],0)+1);
            }
            boolean a = true;
            for (int i = 1; i <= N; i++) {
                if (map.containsKey(i)){
                    if (map.get(i) != i) {
                        if (map.get(i) % i != 0) a = false;
                    }
                }
            }
            if (a) System.out.println("YES");
            else System.out.println("NO");
            T--;
        }
    }
}
