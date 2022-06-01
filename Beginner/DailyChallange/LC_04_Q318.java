package Beginner.DailyChallange;

public class LC_04_Q318 {
    public static void main(String[] args) {
        String []arr = {"abcw","baz","foo","bar","xtfn","abcdef"};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(String[] words) {
        //        We have made as store of array which can store integers equal to the length of words array.
//        In this , we will store the bit wise code of characters present in this store array.
        int [] store = new int [words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
//                Number 1 is left shifted words[i].charAt(j) -'a' times. If character is a , we need not left shift a.
//                If character is 'b' , we need to left shift 1 by 1 and so on.
//                We are going to use 26 bits for a word out of the 32 bit integer. Bits start from right to left.
//                So for 'a', the first bit changed is 0000 0000 0000 0001.
                store[i] |= (1 << (words[i].charAt(j)-'a'));
            }
        }

//        Let us assume the largest is 0.
        int largest = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
//                If i == j , we are doing it for the same element which will have store[i] and store[j] = 1 ,
//                just extra calculation.
//                If store[i] & store[j] == 0 it means they do not have any elements same.
//                As if they have different characters, then they will not have any common 1 in 32 bits.
//                So, and operator should eventually result in 0's only.
                if(i != j && (store[i] & store[j]) == 0){
                    largest = Math.max(largest,words[i].length() *words[j].length());
                }
            }
        }
        return largest;
    }
}
