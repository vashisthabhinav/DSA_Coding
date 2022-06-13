package Bootcamp.Arrays;

import java.util.Arrays;

public class K_07_SuccessfulPairOfSpellsAndPotionsG {
    //Q2300 Binary Search
    public static void main(String[] args) {
        int[] spells = {5,1,3} , potions = {1,2,3,4,5};
        long success = 7;
        System.out.println(Arrays.toString(successfulPairs(spells,potions,success)));
    }
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans = new int[spells.length];
        for (int i = 0; i < spells.length ; i++) {
            ans[i] = potions.length-1 - binarySearch(potions,spells[i],success);
        }
        return ans;
    }
    public static int binarySearch(int[] potions, long spell, long success) {
        int start = 0 , end = potions.length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            long num = (long) (spell * potions[mid]);
            if (num < success) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}
