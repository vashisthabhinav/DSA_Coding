package DSA.Codeforces;

import java.util.Scanner;

public class CF_20_ThreeDoors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t>0){
            int x = sc.nextInt() - 1;
            int[] doors = new int[3];
            int count = 1;
            for (int i = 0; i < 3; i++) {
                doors[i] = sc.nextInt();
            }
            while (doors[x] != 0){
                x = doors[x] - 1  ;
                count++;
            }
            if (count==3) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
