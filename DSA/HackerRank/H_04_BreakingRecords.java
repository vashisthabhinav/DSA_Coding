package DSA.HackerRank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class H_04_BreakingRecords {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(20);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(25);
        list.add(1);
        System.out.println(breakingRecords(list));
    }
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int lowRec = 0 , highRec = 0;
        int firstlow = scores.get(0) , firstHigh = scores.get(0);
        for(int i = 1 ; i < scores.size() ; i++){
            int currentScore = scores.get(i);
            if(currentScore>firstHigh) {
                highRec++;
                firstHigh = currentScore;
            }
            if(currentScore<firstlow) {
                lowRec++;
                firstlow = currentScore;
            }
        }
        List<Integer> ans = new ArrayList<>();
        ans.add(highRec);
        ans.add(lowRec);
        return ans;
    }

}
