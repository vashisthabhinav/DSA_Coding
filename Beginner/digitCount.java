package Beginner;

public class digitCount {
    public static void main(String[] args) {
        String num = "030";
        System.out.println(digitCount(num));
        char c = '0';
        int i = 0;
        int s = 48;
//        System.out.println(c==s);
    }  
    public static boolean digitCount(String str) {
        int[] nums = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            nums[i] = Integer.valueOf(str.charAt(i))-48;
        }
        boolean equalDigitCount = false;
        for (int i = 0; i < nums.length ; i++) {
            boolean flag;
            int count = 0;
            for (int j = 0; j < nums.length ; j++) {
                if (nums[j]==i) {
                    count++;
                }
            }
            if (nums[i]==count){
                flag = true;
            }else{
                flag = false;
            }
        }
        return equalDigitCount;
    }
}
