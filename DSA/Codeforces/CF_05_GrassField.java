package DSA.Codeforces;

import java.util.Scanner;

public class CF_05_GrassField {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t>0){
            int[][] matrix = new int[2][2];
            matrix[0][0] = sc.nextInt();
            matrix[0][1] = sc.nextInt();
            matrix[1][0] = sc.nextInt();
            matrix[1][1] = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    sum += matrix[i][j];
                }
            }
            if (sum==0) {
                System.out.println(0);
            }else if (sum<4){
                System.out.println(1);
            }else System.out.println(2);
            t--;
        }
    }
}
