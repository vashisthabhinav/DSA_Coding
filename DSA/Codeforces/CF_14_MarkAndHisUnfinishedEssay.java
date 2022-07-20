package DSA.Codeforces;

import java.util.Scanner;

public class CF_14_MarkAndHisUnfinishedEssay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t>0){
            int n = sc.nextInt();
            int c = sc.nextInt();
            int q = sc.nextInt();
            String s = sc.next();
            s = s.substring(0,n);
            int [] copy = new int[2*c];
            for (int i = 0; i < 2*c; i++) {
                copy[i] = sc.nextInt()-1;
            }
            int[] queries = new int[q];
            for (int i = 0; i < q; i++) {
                queries[i] = sc.nextInt()-1;
            }
            int i = 0;
                while (i < 2*c){
                    s += s.substring(copy[i],copy[i+1]+1);
                    i +=2;
                }
            for (int k = 0; k < queries.length; k++) {
                System.out.println(s.charAt(queries[k]));
            }
            t--;
        }
    }
}
