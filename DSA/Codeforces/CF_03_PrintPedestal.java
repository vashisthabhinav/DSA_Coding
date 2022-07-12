package DSA.Codeforces;

import java.util.Scanner;

public class CF_03_PrintPedestal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            int blocks = Integer.parseInt(sc.nextLine());
            int left = 2 , mid = 3 , right = 1;
            blocks -= 6;
            if (blocks>0){
                mid += blocks;
            }
            while (mid>left && left > right){
                if (mid-2 > left+1){
                    left++;
                    mid-=2;
                    right++;
                }else if (mid - 1 > left + 1){
                    mid--;
                    left++;
                }
                else break;
            }
            System.out.println(left + " " + mid + " " + right);
        }
    }
}
