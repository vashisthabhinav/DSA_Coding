package DSA.Codeforces;

import java.util.Scanner;

public class CF_02_LongWords {
    public static void main(String[] args) {
//        int n;
//        Scanner number = new Scanner(System.in);
//        n = number.nextInt();
//        while (n>0){
//            Scanner sc = new Scanner(System.in);
//            String word = sc.nextLine();
//            StringBuilder ans = new StringBuilder();
//            if (word.length()>10){
//                ans.append(word.charAt(0));
//                int i = 1 , count = 0;
//                while (i < word.length() - 1){
//                    count++;
//                    i++;
//                }
//                ans.append(count);
//                ans.append(word.charAt(word.length()-1));
//                System.out.println(ans);
//            }else{
//                System.out.println(word);
//            }
//            n--;
//        }


        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            int length = word.length();
            if (length>10){
                int count = length - 2;
                String ans = String.valueOf(word.charAt(0)) +
                        count +
                        word.charAt(length - 1);
                System.out.println(ans);
            }else{
                System.out.println(word);
            }
        }
    }
}
