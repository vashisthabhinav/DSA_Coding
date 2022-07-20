package DSA.Codeforces;

import java.util.Scanner;

public class CF_15_MarkTheDustSweeper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t>0){
            int n = sc.nextInt();
            int[] rooms = new int[n];
            for (int i = 0; i < n; i++) {
                rooms[i] = sc.nextInt();
            }
            int i = 0;
            int j = 0;
            int count = 0;
            while (i<n-1){
                if (rooms[i] > 0){
                    count += rooms[i];
                }
                i++;
            }
            while (j<n){
                if (rooms[j]>0){
                    int k = j+1;
                    while (k<n-1){
                        if (rooms[k]==0) count++;
                        k++;
                    }
                    break;
                }
                j++;
            }
            System.out.println(count);
            t--;
        }
    }
}
