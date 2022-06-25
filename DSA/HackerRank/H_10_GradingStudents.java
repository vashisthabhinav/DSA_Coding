package DSA.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class H_10_GradingStudents {
    public static void main(String[] args) {

    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < grades.size() ; i++){
            int marks = grades.get(i);
            if(marks < 38) {
                ans.add(marks);
            }
            else{
                if(marks%5 > 2){
                    marks = marks + (5- marks%5);
                    ans.add(marks);
                }else{
                    ans.add(marks);
                }
            }
        }
        return ans;
    }
}
