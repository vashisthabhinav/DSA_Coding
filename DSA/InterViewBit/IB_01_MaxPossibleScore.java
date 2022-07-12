package DSA.InterViewBit;

import java.util.ArrayList;

public class IB_01_MaxPossibleScore {
    public static void main(String[] args) {

    }
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int ans = 0;
        int n = A.size();
        boolean strike;
        for (int i = 0; i < n; i++) {
            if (i+1 < n && A.get(i) + A.get(i+1) >= B.get(i) + B.get(i+1)){

            }
        }
        return ans;
    }
}
