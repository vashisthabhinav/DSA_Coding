package DSA.Codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class CF_23_RemovePrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t>0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            HashSet<Integer> set = new HashSet<>();
            int count = 0;
            for (int i = n - 1 ; i >=0; i--) {
                if (set.add(nums[i]));
                else {
                    count = i+1;
                    break;
                }
            }
            System.out.println(count);
            t--;
        }
    }
}
