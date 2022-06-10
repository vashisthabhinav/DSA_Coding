package Bootcamp.Strings;

import java.util.HashMap;

public class B_07_EqualDigitCountR {
    public static void main(String[] args) {
        String num = "1210";
        System.out.println(digitCount(num));
    }
    public static boolean digitCount(String num) {
        //Q-2283
        HashMap<Integer,Integer> map = new HashMap<>();
        //Initiated a HashMap with key and value pairs both of integer type
        for(int i = 0; i < num.length(); i++){
            //Iterating over the string
            int frequency = Character.getNumericValue(num.charAt(i));
            //This will give the frequency of the number in the string as digit 'i' occurs num[i] times in num
            /*Returns the Numeric Value --> A is 10 (1,2,3,4,5,6,7,8,9,A,B,....etc)
             It returns -1 if the specified character does not have any int(numeric) value
             and -2 if the character has a numeric value that cannot be represented as a non-negative integer
             (for example a fraction or a decimal value).
             */
            map.put(i,frequency);//Putting the frequency of the values we got into the HashMap
        }
        for(int index = 0; index< num.length(); index++){
            //Again iterating the string

            //If character at index i is less than num.length(), then only we need to know its frequency.
            //For example if string is "92112", we need not check for 9 because it is greater than the num string
            if (Character.getNumericValue(num.charAt(index)) < num.length()) {
                //Get the frequency of the number and subtract 1 from it if it is present.
                int frequency = map.get(Character.getNumericValue(num.charAt(index))) - 1;
                // get --> Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
                map.put(Character.getNumericValue(num.charAt(index)), frequency);
            }
            /*
            "1210"
            We are checking the frequency of the number
            for index = 0 ; chatAt(index) = 1 and its current frequency is 2. So dec frequency by 1 remaining frequency = 1
            for index = 1 ; chatAt(index) = 2 and its current frequency is 1. So dec frequency by 1 remaining frequency = 0
            for index = 2 ; chatAt(index) = 1 and its current frequency is 1. So dec frequency by 1 remaining frequency = 0
            for index = 3 ; chatAt(index) = 0 and its current frequency is 1. So dec frequency by 1 remaining frequency = 0
             */
        }
        for (int i = 0; i < num.length(); i++) {
            if(map.get(i) !=0){
                //Now if the digit 'i' does not occur num[i] times in num
                return false;//Return false
            }
        }
        return true;//else true
    }
}
