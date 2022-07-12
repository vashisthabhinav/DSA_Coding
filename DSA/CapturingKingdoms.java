package DSA;

import java.util.ArrayList;
import java.util.Collections;

public class CapturingKingdoms {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(10);
        list.add(1);
        list.add(9);
//        list.add(8);
        System.out.println(solve(list));
    }
    public static int solve(ArrayList<Integer> A) {
        int ans = 0;
        int troops = 0;
        int X = 1;
        Collections.sort(A);
        boolean[] isVisited = new boolean[A.size()];
        int i = 0;
        while(i<A.size()){
            if(isVisited[i]){
                i++;
                continue;
            }
            while(A.get(i)>troops){
                troops = troops+X;
                ans++;
            }
            for(int j = i ; j < A.size() ; j++){
                if(!isVisited[j] && A.get(j)==troops ){
                    troops = 0;
                    X++;
                    if(j==i) i++;
                    isVisited[j] = true;
                    break;
                }
                if(!isVisited[j] && j>i && A.get(j)<troops ){
                    troops = 0;
                    X++;
                    isVisited[j] = true;
                    break;
                }
            }
            if(i<A.size() && !isVisited[i] && troops> A.get(i) ){
                troops = 0;
                isVisited[i] = true;
                X++;
                i++;
            }
        }
        return ans;
    }
}
