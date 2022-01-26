package Beginner.Easy;
import java.util.*;
class LC_04_RomanToInteger {
    private static Map<Character,Integer> CHAR_VS_NUM = new HashMap<>();
    static{
        CHAR_VS_NUM.put('I',1);
        CHAR_VS_NUM.put('V',5);
        CHAR_VS_NUM.put('X',10);
        CHAR_VS_NUM.put('L',50);
        CHAR_VS_NUM.put('C',100);
        CHAR_VS_NUM.put('D',500);
        CHAR_VS_NUM.put('M',1000);
    }

    public static int romanToInt(String s) {
        int number = 0;
        int currentValue = 0;
        int prevValue = 0;
        for(int i = s.length() - 1;i >= 0; i--){
            currentValue = CHAR_VS_NUM.get(s.charAt(i));
            if(prevValue <= currentValue)
                number += currentValue;
            else
                number -= currentValue;

            prevValue = CHAR_VS_NUM.get(s.charAt(i));
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LIX"));
    }
}
