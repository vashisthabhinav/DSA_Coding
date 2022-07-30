package DSA.Codechef;

import java.util.Arrays;
import java.util.Scanner;

public class CC_33_PositiveArray {
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
            boolean[] isVisited = new boolean[N];
            Arrays.sort(arr);
            int i = 0;
            int count = 0;
            while (i<N){
                if (!isVisited[i]){
                    int k = 0;
                    for (int j = i; j < N; j++) {
                        if (arr[j]>=k + 1 && !isVisited[j]){
                            isVisited[j] = true;
                            k++;
                        }
                    }
                    count++;
                    i++;
                }else {
                    i++;
                }
            }
            System.out.println(count);
            T--;
        }
    }
}
