package DSA.Algorithms.SlidingWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class S_04_SlidingWindowMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        Collections.addAll(A,648, 614, 490, 138, 657, 544, 745, 582, 738, 229, 775, 665, 876, 448, 4, 81, 807, 578, 712, 951, 867, 328, 308, 440, 542, 178, 637, 446, 882, 760, 354, 523, 935, 277, 158, 698, 536, 165, 892, 327, 574, 516, 36, 705, 900, 482, 558, 937, 207, 368);
        System.out.println(slidingMaximum(A,9));
    }
    public static ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> tentativeMax = new ArrayList<>();
        int i = 0 , j = 0;
        while(j < A.size()){
            int k = tentativeMax.size()-1;
            while (tentativeMax.size() != 0 && tentativeMax.get(k) < A.get(j)){
                tentativeMax.remove(k--);
            }
            tentativeMax.add(A.get(j));
            if (j-i+1<B){
                j++;
            }
            else{
                ans.add(tentativeMax.get(0));
                if (Objects.equals(tentativeMax.get(0), A.get(i))){
                    //equals removes the null case
                    tentativeMax.remove(0);
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
