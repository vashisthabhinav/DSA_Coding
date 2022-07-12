package DSA.Arrays;

import java.util.Arrays;

public class K_18_PoliceStation {
    public static void main(String[] args) {
       int N = 12, a = 54;
        int []x = {67, 32, 27, 22, 94, 17, 66, 57 ,60 ,52 ,73 ,49};
        System.out.println(solve(N,a,x));
        System.out.println(solve1(N,a,x));
    }
    public static int solve(int N, int a, int[] x) {
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i!=j){
                    int distance = Math.abs(a-x[i]) + Math.abs(a-x[j]);
                    ans = Math.max(distance,ans);
                }
            }
        }
        return ans;
    }
    public static int solve1(int N, int a, int[] x) {
        int ans ;
        Arrays.sort(x);
        int index = 0;
        for (int i = 1; i < N-1; i++) {
            if (x[i-1]<a && x[i+1]>a){
                index = i;
            }
        }
        for (int i = 0; i < N; i++) {
            if (x[i]==a) index = i;

        }
        if (x[N-1]<a) index = N+1;
        if (x[0]>a) index = -1;
        int half = N/2 , x1 , x2 ;
        if (index>half){
            x1 = x[0];
            x2 = x[1];
        }else {
            x1 = x[N-1];
            x2 = x[N-2];
        }
        ans = Math.abs(a-x1) + Math.abs(a-x2);
        return ans;
    }
}
//12 54
//67 32 27 22 94 17 66 57 60 52 73 49
