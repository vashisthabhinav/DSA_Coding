package DSA.Codeforces;

import java.util.Scanner;

public class CF_08_TrainAndQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t>0){
            String empty = sc.nextLine();
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int[] ak = new int[k];
            int[] bk = new int[k];
            for (int i = 0; i < k; i++) {
                ak[i] = sc.nextInt();
                bk[i] = sc.nextInt();
            }

            for (int i = 0; i < k; i++) {
                int a = ak[i];
                int b = bk[i];
                boolean ans = false;
                for (int j = 0; j < n; j++) {
                    if (nums[j]==a){
                        int l = j;
                        while (l<n){
                            if (nums[l]==b){
                                System.out.println("YES");
                                ans = true;
                                break;
                            }
                            l++;
                        }
                        break;
                    }
                }
                if (!ans) System.out.println("NO");
            }
            t--;
        }
    }
}
