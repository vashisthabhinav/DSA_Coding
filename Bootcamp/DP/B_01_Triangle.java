package Bootcamp.DP;

import java.util.List;

public class B_01_Triangle {
    public static void main(String[] args) {

    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        for(int i = n-2 ; i >=0 ; --i){
            for(int j = 0 ; j < triangle.get(i).size() ; ++j){
                triangle.get(i).set(j, triangle.get(i).get(j)+Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)));
            }
        }
        return triangle.get(0).get(0);
    }
}
