package Bootcamp.BinarySearch;

public class B_04_NextGreaterLetter {
//    Q-744 LeetCode
/*
Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.
*/
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end  = letters.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target<letters[mid]) end = mid-1;
            else if (target>=letters[mid]) start = mid+1;
        }
        /*
        char [] letters = {'c','f','j'};
        char target = 'j';
        Condition violated- start = end+1 = letters.length
        In this case loop will break when e=2(or letters.length-1 in any other case) and s=3(or letters.length in any other case) (s>e)
        Now we have to return 'c' i.e., at index 0
        so - start%letters.length = 3%3 i.e, 0
        In every other case when start is less than letters.length
        start%letters.length = start only.
         */
        //Method1
//        return letters[start%letters.length];
        /*
        Note that the letters wrap around.
        For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
         */
        //Method2
        if (start==letters.length) return letters[0];
        else return letters[start];
    }
    public static void main(String[] args) {
        char [] letters = {'c','f','j'};
        char target = 'j';
        System.out.println(nextGreatestLetter(letters,target));
    }
}
