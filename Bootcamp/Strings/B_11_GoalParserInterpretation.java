package Bootcamp.Strings;

public class B_11_GoalParserInterpretation {
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        System.out.println(interpret(command));
    }
    public static String interpret(String command) {
        //Q-1678
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < command.length() ; i++) {
            int currentChar = command.charAt(i);
            if (currentChar != '(' && currentChar != ')'){
                ans.append(Character.toString(currentChar));
            }
            if (currentChar == '('){
                if (command.charAt(i+1) == ')'){
                    ans.append('o');
                }
            }
        }
        return ans.toString();
    }
}
