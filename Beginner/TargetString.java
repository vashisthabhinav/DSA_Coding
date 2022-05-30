package Beginner;

public class TargetString {
    public static void main(String[] args) {
        String s = "abbaccaddaeea", target = "aaaaa";
        System.out.println(rearrangeCharacters(s,target));
    }
    public static int rearrangeCharacters(String s, String target) {
        char[] s1 = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            s1[i] = s.charAt(i);
        }
        char[] target1 = new char[target.length()];
        for (int i = 0; i < target.length(); i++) {
            target1[i] = target.charAt(i);
        }
        int [] ans = new int[target1.length];
        for (int i = 0; i < target1.length ; i++) {
                for (int j = 0; j < s1.length ; j++) {
                    if (target1[i]==s1[j]){
                        ans[i]++;
                        s1[j]=0;
                        break;
                    }
                }
            }
        int min = ans[0];
        //Loop through the array
        for (int i = 0; i < ans.length; i++) {
            //Compare elements of array with min
            if(ans[i] <min)
                min = ans[i];
        }
        return min;
    }
}
