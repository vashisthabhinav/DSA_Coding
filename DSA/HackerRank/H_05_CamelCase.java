package DSA.HackerRank;

import java.util.Scanner;

public class H_05_CamelCase {
    public static void main(String[] args) {
        /*
        Enter your code here. Read input from STDIN(Standard Input Device).
        Print output to STDOUT(Standard Input Device).
        Your class should be named Solution.
         */
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            char operation = input.charAt(0);
            char type = input.charAt(2);
            String words = input.substring(4);
            char[] wordsArr = words.toCharArray();
            StringBuilder output = new StringBuilder();
            if (operation == 'S') {
                for (int i = 0; i < wordsArr.length ; i++) {
                    char currentChar = wordsArr[i];
                    if (Character.isUpperCase(currentChar)) {
                        output.append(" ").append(Character.toLowerCase(currentChar));
                    } else if (currentChar != '(' && currentChar != ')') {
                        output.append(currentChar);
                    }
                }
            } else if (operation == 'C') {
                for (int i = 0; i < wordsArr.length; i++) {
                    char currentChar = wordsArr[i];
                    if (currentChar != ' ') {
                        if (i > 0 && wordsArr[i - 1] == ' ') {
                            currentChar = Character.toUpperCase(currentChar);
                        }
                        output.append(currentChar);
                    }
                }
                if (type == 'M') {
                    output.append("()");
                } else if (type == 'C') {
                    output = new StringBuilder(output.substring(0, 1).toUpperCase() + output.substring(1));
                }
            }
            System.out.println(output.toString().trim());
        }
    }
}
