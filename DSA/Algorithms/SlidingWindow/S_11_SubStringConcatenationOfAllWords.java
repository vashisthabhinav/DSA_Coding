package DSA.Algorithms.SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class S_11_SubStringConcatenationOfAllWords {
    public static void main(String[] args) {
        String s = "barfoofoobarthefoobarman";
        String[] words = {"bar","foo","the"};
        System.out.println(findSubstring(s, words));
    }
    public static List<Integer> findSubstring(String s, String[] words) {
        int n = words.length;
        HashMap<String, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            map.put(words[i],map.getOrDefault(words[i],0)+1);
            //This map contains strings present in the array as a key and their occurrence as value.
            //getOrDefault method is used here. If the string is already present, it will give its occurrence value else it will give 0 by default.
            //We add 1 to whatever is returned by this function
            /*
            for words = {"bar","foo","the"}
            map-->
            key - "bar" value = 1;
            key - "foo" value = 1;
            key - "the" value = 1;
             */
        }
        int totalLength = words[0].length() * words.length;//This is the total length of the string that we have to check
        //Length of "foobarthe" in this case

        int subStrLength = words[0].length(); //== length of each element in the array that is to be checked in the string
        int i = 0, j = 0;
        while (j < s.length()) {
            if (j - i + 1 == totalLength) {
                String sub = s.substring(i, j + 1);//j+1 is important as the endIndex is exclusive for substring method
                // It will give a string of length  = totalLength , ex barfoofoo
                HashMap<String, Integer> map2 = new HashMap<>();//Another hashmap to check for the string
                int index = 0;
                while (index < sub.length()) {
                    String temp = sub.substring(index, index + subStrLength);
                    // It will give a string of length  = subStrLength , ex bar
                    map2.put(temp,map2.getOrDefault(temp,0)+1);
                    index += subStrLength;//Checking for the next substring by adding subStrLength
                }
                if (map.equals(map2)){
                    //Adds the index if both the maps are equal
                    ans.add(i);
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}