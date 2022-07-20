package DSA.Codeforces;

import java.util.Scanner;

public class CF_11_Cypher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] b = new int[n];
            String[] moves = new String[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                moves[i] = sc.next();
            }
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                int currNum = a[i];
                for (int j = 0; j < b[i]; j++) {
                    if (moves[i].charAt(j) == 'D'){
                        currNum = (currNum+1)%10;
                    }else {
                        if (currNum>0){
                            currNum = (currNum-1)%10;
                        }else {
                            currNum = 9;
                        }
                    }
                }
                ans[i] = currNum;
            }
            for (int i = 0; i < n-1; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println(ans[n-1]);
            t--;
        }
    }
}
