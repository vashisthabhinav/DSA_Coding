package DSA.HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class H_07_SparseArrays {
    public static void main(String[] args) {

    }
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries){
        HashMap<String, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < strings.size() ; i++){
            map.put(strings.get(i), map.getOrDefault(strings.get(i),0)+1);
        }
        for(int i = 0 ; i < queries.size() ; i++){
            if(map.containsKey(queries.get(i))){
                int val = map.get(queries.get(i));
                ans.add(val);
            }else{
                ans.add(0);
            }
        }
        return ans;
    }

}
